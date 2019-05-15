app.service("applyService",function($http){
	
	//导出申请表
	this.applyTable = function(apply){
		return $http.post("apply/downloadPath.do",apply);  
	}
})  