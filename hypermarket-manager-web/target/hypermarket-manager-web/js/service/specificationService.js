app.service('SpecificationService',function ($http) {
	this.findAll=function () {
		return $http.get('../specification/findAll.do');
	}
	this.findPage=function (page,size) {
		return $http.get('../specification/findPage.do?page='+page+'&size='+size);
	}
	this.findOne=function (id) {
		return $http.get('../specification/findOne.do?id='+id);
	}
	this.add=function (entity) {
		return $http.post('../specification/add.do',entity);
	}
	this.update=function (entity) {
		return $http.post('../specification/update.do',entity);
	}
	this.dele=function (ids) {
		return $http.post('../specification/delete.do?ids=',ids);
	}
	this.search=function (page,size,searchEntity) {
		return $http.post('../specification/search.do?page='+page+'&size='+size,searchEntity);
	}
	this.selectOptionList=function () {
		return $http.get('../specification/selectOptionList.do');
	}
});