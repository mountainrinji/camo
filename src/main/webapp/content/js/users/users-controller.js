var usersControllerModule = angular.module('usersControllerModule', ['usersServiceModule']);

usersControllerModule.controller('usersController', ['$scope', 'usersService', function($scope, usersService){
	$scope.data = {};
	$scope.simple = {};
	$scope.username = {};
	
	$scope.getOneValue = function(queryName, dataToBeSet) {
		usersService.getOneValue(queryName, function(data) {
			$scope[dataToBeSet] = data;
		});
	}
	
	$scope.getSimple = function() {
		
		return usersService.getSimple();
	}
	
	$scope.getOneValue({queryName: 'GET_USERNAME', userId: '1', userCar: 'mercredes'},  'username');
	
	
	
}]);