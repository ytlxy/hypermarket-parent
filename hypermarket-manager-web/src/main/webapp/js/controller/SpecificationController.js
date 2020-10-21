//服务层
app.service('SpecificationService',function ($http) {
    //读取列表数据绑定到列表
    this.findAll=function () {
        return $http.get('../Specification/findAll.do');
    }

    //分页
    this.findPage=function (page,rows) {
        return $http.get('../Specification/findPage.do?page='+page+'&rows='+rows);
    }

    //查询实体
    this.findOne=function (id) {
        return $http.get('../Specification/findOne.do?id='+id);
    }

    //增加
    this.add=function (entity) {
        return $http.post('../Specification/add.do',entity);
    }

    //修改
    this.update=function (entity) {
        return $http.post('../Specification/update.do',entity);
    }

    //删除
    this.detect=function (ids) {
        return $http.post('../Specification/detele.do?ids=',ids);
    }

    //搜索
    this.search=function (page,rows,searchEntity) {
        return $http.post('../Specification/search.do?page='+page+'rows'+rows,searchEntity);
    }

    //下拉列表
    this.selectOptionList=function () {
        return $http.get('../Specification/selectOptionList.do');
    }

});