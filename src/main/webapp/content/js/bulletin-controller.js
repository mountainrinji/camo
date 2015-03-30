var bulletinControllerModule = angular.module('bulletinControllerModule', ['bulletinServiceModule']);

bulletinControllerModule.controller('bulletinController', ['$scope', 'bulletinService', function($scope, bulletinService){
	
	$scope.testField = 'Test Field';
	
	$scope.createBulletinForm = {};
	
	$scope.createBulletinForm.createBulletin = function (item, event) {
		alert($scope.createBulletinForm.name + ':' + $scope.createBulletinForm.mandatory);
		var bulletin = {'id':90, 'name':$scope.createBulletinForm.name};
		bulletinService.createBulletin(bulletin);
	}
	
}]);