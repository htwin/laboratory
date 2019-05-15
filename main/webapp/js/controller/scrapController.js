app.controller("scrapController",function($scope,$location,scrapService){
	
	$scope.scrapVo={};//报废对象
	$scope.pages=[];//页码集合，用于显示页码
	$scope.scrapList=[];//报废的列表
	$scope.scrap={};//报废设备对象
	$scope.search = function(pages,rows){ 
		scrapService.search(pages,rows,$scope.scrapVo).success(function(response){
			//当前页
			$scope.currentPage = response.currentPage;
			//总页数
			$scope.pageNum = response.pageNum;
			//设备列表
			$scope.scrapList = response.list;
			//通过循环将总页数，分开装入页码集合中，然后在页面显示
			var pageNum = new Array();
			for(var i=0;i<response.pageNum;i++){
				pageNum[i]=i+1;
			}
			$scope.pages = pageNum;
		});
	}
	//选中id是个集合，批量删除
	$scope.selectIds = [];
	//选中设备id是个集合，批量删除
	$scope.selectEquipmentIds = [];
	$scope.del = function(id,equipmentId){
		
		if(id==null){
			if($scope.selectIds.length==0){
				alert("请选择删除的对象！！！");
				return;
			}else{
				if(confirm("确认要删除吗????")){
					scrapService.del($scope.selectIds,$scope.selectEquipmentIds).success(function(response){
						if(response.success){
							alert(response.message);
							window.location.href="scrap.html";
						}else{
							alert(response.message);
						}
					});
				}
				
			}
		}else{
			if(confirm("确认要删除吗????")){  
				$scope.selectIds==[]; 
				$scope.selectIds.push(id);
				$scope.selectEquipmentIds.push(equipmentId);
				scrapService.del($scope.selectIds,$scope.selectEquipmentIds).success(function(response){
					if(response.success){
						alert(response.message);
						window.location.href="scrap.html";
					}else{
						alert(response.message);
					}
				});
			}
			
		}
		
	}
	
	$scope.updateSelectOption = function($event,id,equipmentId){
		if($event.target.checked){
			$scope.selectIds.push(id);
			$scope.selectEquipmentIds.push(equipmentId);
		}else{
			var index = $scope.selectIds.indexOf(id);
			$scope.selectIds.splice(index,1);//删除
			
			var index = $scope.selectEquipmentIds.indexOf(equipmentId);
			$scope.selectEquipmentIds.splice(index,1);//删除
		}
	}
	
	
});