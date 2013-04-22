require
	shim:
		'controllers/chat'                   : deps: ['app', 'services/chat']
		'vendor/angular/angular-resource'    : deps: ['vendor/angular/angular']
		'services/chat'                      : deps: ['app']
		'app'                                : deps: ['vendor/angular/angular', 'vendor/angular/angular-resource']
		'bootstrap'                          : deps: ['app']
		'routes'                             : deps: ['app']
		'run'                                : deps: ['app']
		'views'                              : deps: ['app']
	[
		'require'
		'bootstrap'
		'vendor/angular/angular'
	], (require, bootstrap) ->
		angular.element(document).ready ->
			require ['bootstrap']