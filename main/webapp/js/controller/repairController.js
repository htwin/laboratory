app.controller("repairController",function($scope,$location,repairService){
	
	$scope.repairVo={};//报修对象
	$scope.pages=[];//页码集合，用于显示页码
	$scope.repairList=[];//报修的列表
	$scope.scrap={};//报废设备对象
	$scope.repair={};//报修设备对象
	$scope.search = function(pages,rows){ 
		repairService.search(pages,rows,$scope.repairVo).success(function(response){
			//当前页
			$scope.currentPage = response.currentPage;
			//总页数
			$scope.pageNum = response.pageNum;
			//设备列表
			$scope.repairList = response.list;
			//通过循环将总页数，分开装入页码集合中，然后在页面显示
			var pageNum = new Array();
			for(var i=0;i<response.pageNum;i++){
				pageNum[i]=i+1;
			}
			$scope.pages = pageNum;
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
	//显示报修好的窗口
	$scope.showRepairSuccessForm = function(equipmentId,repairId){
		$scope.repair.id = repairId;
		$scope.repair.equipmentId = equipmentId;
		layui.use('layer', function() {
			var layer = layui.layer;
			layer.open({
				type:1,
				title:"修理成功处理",
				content:$("#repairSuccessForm"),
				area: ['500px', '300px']
			});
		});
	}
	
	//修理成功处理
	$scope.repairSuccess = function(){
		repairService.repairSuccess($scope.repair).success(function(response){
			if(response.success){
				alert(response.message);
				window.location.href="repair.html";
			}else{
				alert(response.message);
			}
		});
	}
	
	//报废处理
	$scope.scrapEquipment = function(){
		repairService.scrap($scope.scrap).success(function(response){
			if(response.success){
				alert(response.message);
				window.location.href="repair.html";
			}else{
				alert(response.message);
			}
		});
		
	}
	
});