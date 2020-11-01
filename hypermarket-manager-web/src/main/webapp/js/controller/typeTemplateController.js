//控制层tbTypeTemplateController
app.controller('tbTypeTemplateController',function ($scope,$controller,tbTypeTemplateService,brandService,specificationService) {

	$controller('baseController',{$scope:$scope}); //继承

	//读取列表数据绑定到表单中
	$scope.findAll=function () {
		tbTypeTemplateService.findAll().success(
			function (response) {
				$scope.list=response;
			}
		);
	}

	//分页
	$scope.findPage=function (page,rows) {
		tbTypeTemplateService.findPage(page,rows).success(
			function (response) {
				$scope.list=response.rows;
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}
		);
	}

	//查询实体
	$scope.findOne=function (id) {
		tbTypeTemplateService.findOne(id).success(
			function (response) {
				$scope.entity=response;

				//转换字符串为json对象（集合）
				$scope.entity.brandIds=JSON.parse($scope.entity.brandIds);
				$scope.entity.specIds=JSON.parse($scope.entity.specIds);
				$scope.entity.customAttributeItems=JSON.parse($scope.entity.customAttributeItems);
			}
		);
	}

	//保存
	$scope.save=function () {
		var serviceObject; //服务层对象
		if ($scope.entity,id!=null){
			serviceObject=tbTypeTemplateService.update($scope.entity);//修改
		}else {
			serviceObject=tbTypeTemplateService.add($scope.entity); //增加
		}
		serviceObject.success(
			function (response) {
				//重新查询
				$scope.reloadList(); //重新加载
			}
		);
	}

	//批量删除
	$scope.detele=function () {
		//提取选中的复选框
		tbTypeTemplateService.detele($scope.selectIds).success(
			function (response) {
				if (response.success){
					$scope.reloadList(); //刷新列表
					$scope.selectIds=[];
				}
			}
		);
	}

	$scope.searchEntity={}; //定义搜索对象
	//搜索
	$scope.search=function (page,rows) {
		tbTypeTemplateService.search(page,rows,$scope.searchEntity).success(
			function (response) {
				$scope.list=response.rows;
				$scope.paginationConf.totalItems=response.total;
			}
		);
	}

	$scope.brandList={}; //品牌列表

	$scope.findBrandList=function () {
		brandService.selectOptionList().success(
			function (response) {
				$scope.brandList={data:response};
			}
		)
	}
})