app.controller("applyController",function($scope,applyService){
	
	/* private Integer id;

	    private String applicant;

	    private Date applyDate;

	    private String applyEName;

	    private String applyEAmount;

	    private String applyEFactory;

	    private String applyEType;

	    private BigDecimal price;

	    private String reason;*/
	$scope.apply={};//申请表对象
	$scope.applyTable = function(){
		var app = $scope.apply;
		if(app.applicant==null||app.applicant==''||
				app.applyEName==null||app.applyEName==''||
				app.applyEAmount==null||app.applyEAmount==''||
				app.applyEFactory==null||app.applyEFactory==''||
				app.applyEType==null||app.applyEType==''||
				app.reason==null||app.reason==''||app.price==null){
			return;
		}
		applyService.applyTable($scope.apply).success(function(response){
			if(response.success){
				window.location.href=response.message;
			}else{
				alert(response.message); 
			}
		}); 
		
	}
	
	
});