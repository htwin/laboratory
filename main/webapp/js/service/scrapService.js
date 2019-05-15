app.service("scrapService",function($http){
	
	//查询报废设备列表
	this.search = function(pages,rows,scrapVo){
		return $http.post("scrap/search.do?pages="+pages+"&rows="+rows,scrapVo);
	}
	
	//删除
	this.del = function(ids,equipmentIds){
		return $http.get("scrap/delete.do?ids="+ids+"&equipmentIds="+equipmentIds);
	}

	
})