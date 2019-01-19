/**
 * Controller do módulo HOME
 */
(function() { 'use strict';
	
angular
	.module( 'app' )
	.controller( 'homeController', homeController );
	
function homeController() {
	/* jshint validthis: true */
	var vm = this;
	
	vm.nome = "Rafael";
}


})();