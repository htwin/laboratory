app.service("equipmentService",function($http){
	//查询设备列表
	this.search = function(pages,rows,equipment){
		return $http.post("equipment/search.do?pages="+pages+"&rows="+rows,equipment);
	}
	
	//保存
	this.save = function(methodName,equipment){
		return $http.post("equipment/"+methodName+".do",equipment);
	}
	
	//根据id查设备
	this.findEquipmentById = function(id){
		return $http.get("equipment/findEquipmentById.do?id="+id);
	}
	
	//维修
	this.repair = function(repair){
		return $http.post("equipment/repair.do",repair);
	}
	
	//报废
	this.scrap = function(scrap){
		return $http.post("equipment/scrap.do",scrap);
	}
}) 