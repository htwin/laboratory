package com.laboManager.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.laboManager.entity.Result;
import com.laboManager.pojo.TbApply;
import com.laboManager.service.ApplyService;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Controller
@RequestMapping("/apply")
public class ApplyController {
	
	@Autowired
	private ApplyService applyService;
	
	
	/**
	 * 直接下载
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws TemplateException
	 */
	@RequestMapping("/download")
	@ResponseBody
	public void download(HttpServletRequest request, HttpServletResponse response)
			throws IOException, TemplateException {
		// 文件存储的文件路径
		String filePath = request.getSession().getServletContext().getRealPath("applyTable");
		//String path = request.getSession().getServletContext().getRealPath("applyTable/applyTable.docx");
		// 下载的文件名
		String fileName = "实验室新购设备申请表.doc"; 

		// 下载的文件
		String downLoadFile = filePath + "/" + fileName;

		// 创建配置类
		Configuration configuration = new Configuration(Configuration.getVersion());
		// 设置模板所在的目录
		configuration.setDirectoryForTemplateLoading(new File(filePath));
		// 设置字符集
		configuration.setDefaultEncoding("utf-8");
		// 加载模板
		Template template = configuration.getTemplate("applyTable.xml");
		// 创建数据模型
		Map<String, String> map = new HashMap<String, String>();
		/*map.put("name", apply.getApplyEName());
		map.put("type", apply.getApplyEType());
		map.put("price", apply.getPrice() + "");
		map.put("amount", apply.getApplyEAmount());
		map.put("fromFactory", apply.getApplyEFactory());
		map.put("reason", apply.getReason());
		map.put("applicant", apply.getApplicant());*/
		map.put("name", "设备1");
		map.put("type","设备1");
		map.put("price","设备1");
		map.put("amount","设备1");
		map.put("fromFactory","设备1");
		map.put("reason","设备1");
		map.put("applicant","设备1"); 
		// 创建Writer对象
		Writer out = new FileWriter(new File(downLoadFile));
		// 输出
		template.process(map, out);
		
		
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		long fileLength = new File(downLoadFile).length();

		// 设置文件输出类型
		response.setContentType("application/octet-stream");
		response.setHeader("Content-disposition",
				"attachment; filename=" + new String("实验室新购设备申请表.doc".getBytes("utf-8"), "ISO8859-1"));
		// 设置输出长度
		response.setHeader("Content-Length", String.valueOf(fileLength));

		// 获取输入流
		bis = new BufferedInputStream(new FileInputStream(downLoadFile));

		// 输出流
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		// 关闭流
		bis.close(); 
		bos.close();
		// 关闭Writer对象
		out.close();
	}
	
	
	/**
	 * 返回文件的路径
	 * @param apply
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 * @throws TemplateException
	 */
	@RequestMapping("/downloadPath")
	@ResponseBody
	public Result downloadPath(@RequestBody TbApply apply,HttpServletRequest request, HttpServletResponse response) {
		try {
			// 文件存储的文件路径
			String filePath = request.getSession().getServletContext().getRealPath("applyTable");
			//String path = request.getSession().getServletContext().getRealPath("applyTable/applyTable.docx");
			// 下载的文件名
			String fileName = "实验室新购设备申请表.doc"; 

			// 下载的文件
			String downLoadFile = filePath + File.separator+ fileName;

			// 创建配置类
			Configuration configuration = new Configuration(Configuration.getVersion());
			// 设置模板所在的目录
			configuration.setDirectoryForTemplateLoading(new File(filePath));
			// 设置字符集
			configuration.setDefaultEncoding("utf-8");
			// 加载模板
			Template template = configuration.getTemplate("applyTable.xml");
			// 创建数据模型
			Map<String, String> map = new HashMap<String, String>();
			map.put("name", apply.getApplyEName());
			map.put("type", apply.getApplyEType());
			map.put("price", apply.getPrice() + "");
			map.put("amount", apply.getApplyEAmount());
			map.put("fromFactory", apply.getApplyEFactory());
			map.put("reason", apply.getReason());
			map.put("applicant", apply.getApplicant());
			// 创建Writer对象
			Writer out = new FileWriter(new File(downLoadFile));
			// 输出
			template.process(map, out);
			// 关闭Writer对象
			out.close(); 
			
			apply.setApplyDate(new Date());
			//将申请表记录插入到数据库
			applyService.saveApply(apply);
			
			
			//http://localhost:8080/laborate/apply/sss.do;
			//http://localhost:8080/laborate/applyTable/applyTable.docx
			String url ="applyTable"+File.separator+fileName;
			return new Result(true, url);
		} catch (Exception e) { 
			e.printStackTrace();
			return new Result(true, "下载失败");
		} 
	}

}
