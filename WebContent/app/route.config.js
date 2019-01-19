/**
 * Configuracao principal do Router das páginas e seus controllers
 */
(function() { 'use strict';
	
angular
	.module('app')
	.config(config);
	
function config($routeProvider) {
	$routeProvider
	.when ('/', {
		templateUrl: 'app/components/home/home.html',
		controller: 'homeController'
	});
		
}


})();