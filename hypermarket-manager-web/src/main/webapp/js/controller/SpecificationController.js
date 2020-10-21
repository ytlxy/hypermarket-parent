//控制层
app.controller('SpecificationControllrt',function ($scope,$controller,SpecificationService) {
    $controller('baseController',{$scope:$scope});//继承

    //读取列表数据绑定到表单中
    $scope.findAll=function () {
        SpecificationService.findAll().success(
            function (response) {
                $scope.list=response;
            }
        );
    }

    //分页
    $scope.findPage=function (page,rows) {
        SpecificationService.findAll(page,rows).success(
          function (response) {
            $scope.list=response.rows;
            $scope.paginationConf.totalItems=response.total;//更新总记录数
          }
        );
    }

    //查询实体
    $scope.findOne=function (id) {
        SpecificationService.findOne(id).success(
           function (response) {
                $scope.entity=response;
           }
        );
    }

    //保存
    $scope.save=function () {
        var serviceObject; //服务层对象
        if ($scope.entity.specification.id!=null){
            serviceObjec=SpecificationService.update($scope.entity); //修改
        }else {
            serviceObject=SpecificationService.add($scope.entity); //增加
        }
        serviceObject.success(
          function (response) {
            if (response.success){
                //重新查询
                $scope.reloadList(); //重新加载
            }else {
                alert(response.message);
            }
          }
        );
    }

    //批量删除
    $scope.detele=function () {
        //获取选中的复选框
        SpecificationService.detele($scope.selectIds).success(
            function (response) {
                if (response.success){
                    $scope.reloadList(); //刷新
                    $scope.selectIds=[];
                }
            }
        );
    }

    $scope.searchEntity={}; //定义搜索对象

    //搜索
    $scope.search=function (page,rows) {
        SpecificationService.search(page,rows,$scope.searchEntity).success(
            function (response) {
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }

    $scope.entity={selectOptionList:[]};

    //增加规格选项行
    $scope.addTableRow=function () {
        $scope.entity.selectOptionList.push({});
    }

    //删除规格选项行
    $scope.deteleTableRow=function () {
        $scope.entity.selectOptionList.splice(index,1);
    }
});