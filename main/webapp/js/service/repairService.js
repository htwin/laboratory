app.service("repairService",function($http){
	
	//查询报修设备列表
	this.search = function(pages,rows,repairVo){
		return $http.post("repair/search.do?pages="+pages+"&rows="+rows,repairVo);
	}
	

	//报废
	this.scrap = function(scrap){
		return $http.post("repair/scrap.do",scrap);
	}
	
	//修理成功处理
	this.repairSuccess = function(repair){
		return $http.post("repair/repairSuccess.do",repair);
	}
	
})