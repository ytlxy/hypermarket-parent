app.controller('brandController', function ($scope, $http,brandService) {
    $scope.findAll = function () {
        brandService.findAll().success(
            function (response) {
                $scope.list = response;
            }
        );
    }
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function () {
            $scope.reloadList();
        }
    };
    $scope.reloadList = function () {
        $scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
    }
    $scope.findPage = function (page, size) {
        brandService.findPage(page,size).success(
            function (response) {
                $scope.list = response.rows;
                $scope.paginationConf.totalItems = response.total;
            }
        );
    }
    $scope.save = function () {
        var object=null;
        if($scope.entity.id!=null){
            object=brandService.update($scope.entity);
        }else{
            object=brandService.add($scope.entity);
        }
        object.success(
            function (response){
                if (response.success){
                    $scope.reloadList();
                }else{
                    alert(response.message);
                }
            }
        );
    }
    $scope.findOne = function (id) {
        brandService.findOne(id).success(
            function (response) {
                $scope.entity = response;
            }
        );
    }
    $scope.selectIds = [];
    $scope.updateSelection = function ($event, id) {
        if ($event.target.checked) {
            $scope.selectIds.push(id);
        } else {
            var idx = $scope.selectIds.indexOf(id);
            $scope.selectIds.splice(idx, 1);
        }
    }
    $scope.dele = function () {
        if (confirm('确定要删除吗?')) {
            brandService.dele($scope.selectIds).success(
                function (response) {
                    if (response.success) {
                        $scope.reloadList();
                    } else {
                        alert(response.message);
                    }
                }
            );
        }
    }
    $scope.searchEntity={};

    $scope.search=function (page,size){
        brandService.search(page,size,$scope.searchEntity).success(
            function (response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;
            }
        );
    }
});