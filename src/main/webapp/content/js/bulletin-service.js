var bulletinServiceModule = angular.module('bulletinServiceModule', ['ngResource', 'camoResourceModule']);

bulletinServiceModule.factory('bulletinService', ['$resource', function($resource){
	return new Bulletin( $resource );
  
}]);

function Bulletin( resource ) {
	
	this.resource = resource;
	
	this.createBulletin = function ( bulletin) {
	
		var Bulletin = resource('http://localhost:8080/camo/rest/genericFacade/newBulletin');     
	
		Bulletin.save(bulletin, function(response){
	
		});
	}
	
}
