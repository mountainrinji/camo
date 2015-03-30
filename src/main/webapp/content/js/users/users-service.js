var usersServiceModule = angular.module('usersServiceModule', ['ngResource']);

usersServiceModule.factory('usersService', function($resource){

	
	return {
		getOneValue : function getOneValue(_queryParams, callback) {
			var resource = $resource('http://localhost:8080/camo/rest/genericFacade/getOneValue');
			resource.save({queryParams : _queryParams}, function(response) {
				callback(response);
			});
		},
		
		getSimple : function getSimple() {
			return "dupa";
			
		}
	};
  
	
});

