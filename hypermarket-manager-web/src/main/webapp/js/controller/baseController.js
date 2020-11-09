app.controller('baseController', function ($scope) {
    //刷新列表
    //刷新
    $scope.reloadList = function () {
        $scope.search($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
    }

    //分页控件配置 currentPage：当前页 totalItems：总记录数 itemsPerPage：每页记录数
    //perPageOptions：分页选项 onChange：当页码变更后自动触发的方法
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function () {
            $scope.reloadList();
        }
    };

    //定义一个变量用户储存要删的id
    $scope.selectIds = [];
    //判断是否删除对应品牌
    $scope.updateSelection = function ($event, id) {
        //判断是否选择
        if ($event.target.checked) {
            $scope.selectIds.push(id);
        } else {
            //取消删，则从数组中移除id
            var idx = $scope.selectIds.indexOf(id); //获取id下标
            $scope.selectIds.splice(idx, 1);//参数一：移除位置参数二：移除个数
        }
    }

    $scope.jsonToString = function (jsonString, key) {
        var json = JSON.parse(jsonString);
        var value = "";
        for (var i=0;i<json.length;i++) {
            if (i>0){
                value+=","
            }
            value+=json[i][key];
        }
        return value;
    }
});