app.controller("equipmentController",function($scope,$location,equipmentService){
	$scope.equipment={};//设备对象
	$scope.equipmentList=[];//设备列表
	$scope.pages=[];//页码集合，用于显示页码
	$scope.repair={};//报修对象
	$scope.scrap={};//报废对象
	$scope.search = function(pages,rows){
		equipmentService.search(pages,rows,$scope.equipment).success(function(response){
			//当前页
			$scope.currentPage = response.currentPage;
			//总页数
			$scope.pageNum = response.pageNum;
			//设备列表
			$scope.equipmentList = response.list;
			//通过循环将总页数，分开装入页码集合中，然后在页面显示
			var pageNum = new Array();
			for(var i=0;i<response.pageNum;i++){
				pageNum[i]=i+1;
			}
			$scope.pages = pageNum;
			
		});
	}
	
	$scope.save = function(){
		var methodName = "add";
		if($scope.id!=null){
			methodName = "update";
		} 
		equipmentService.save(methodName,$scope.equipment).success(function(response){
			if(response.success){
				alert(response.message);
				window.location.href="equipment.html";
				return;
			}else{
				alert(response.message);
			}
		});
	}
	
	$scope.findEquipmentById = function(){ 
		$scope.id = $location.search()['id']; 
		if($scope.id!=null){  
			equipmentService.findEquipmentById($scope.id).success(function(response){
				$scope.equipment = response;
				$scope.equipment.id = $scope.id; 
			});
		}
	}
	
	//显示报修处理窗口
	$scope.showRepairForm = function(id){
		$scope.repair.equipmentId = id;  
		layui.use('layer', function() {
			var layer = layui.layer;
			layer.open({
				type:1,
				title:"报修",
				content:$("#repairForm"),
				area: ['500px', '300px']
			});
		});
	}
	
	//显示报废处理窗口
	$scope.showScrapForm = function(id){
		$scope.scrap.equipmentId = id;  
		layui.use('layer', function() {
			var layer = layui.layer;
			layer.open({
				type:1,
				title:"报废",
				content:$("#scrapForm"),
				area: ['500px', '300px']
			});
		});
	}
	
	//维修，插入
	$scope.repairEquipment = function(){
		equipmentService.repair($scope.repair).success(function(response){
			if(response.success){
				alert(response.message);
				window.location.href="equipment.html";
			}else{
				alert(response.message);
			}
			
		});
	}
	
	
	//报废处理
	$scope.scrapEquipment = function(){
		alert($scope.scrap.equipmentId+","+$scope.scrap.scrapName);
		equipmentService.scrap($scope.scrap).success(function(response){
			if(response.success){
				alert(response.message);
				window.location.href="equipment.html";
			}else{
				alert(response.message);
			}
		});
		
	}
	
	
});