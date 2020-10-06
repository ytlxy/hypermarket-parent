//品牌控制层
app.controller('baseController' ,function($scope){

    //刷新列表
    $scope.reloadList=function(){
        $scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
    }

    //分页控件配置currentPage:当前页   totalItems :总记录数  itemsPerPage:每页记录数
    // perPageOptions :分页选项  onChange:当页码变更后自动触发的方法
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function(){
            $scope.reloadList();
        }
    };

    //定义一个变量，用于存储要删除的品牌ID
    $scope.selectids=[];
    //判断当前点击是否要删除对应品牌
    $scope.updateSelection=function($event,id){
        //判断当前操作是否是选中复选框
        if($event.target.checked){
            //如果选中复选框，则将该id增加到数组中去 push向集合添加元素
            $scope.selectids.push(id);
        }else{
            //取消删除，则从数组中移除该id
            var idx = $scope.selectids.indexOf(id);   //获取id对应的下标
            $scope.selectids.splice(idx, 1);//参数1：移除的位置 参数2：移除的个数
        }
    }
    $scope.jsonToString=function(jsonString,key){

        var json= JSON.parse(jsonString);
        var value="";

        for(var i=0;i<json.length;i++){
            if(i>0){
                value+=",";
            }
            value +=json[i][key];
        }

        return value;
    }
});