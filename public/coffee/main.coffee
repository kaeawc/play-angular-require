require
	shim:
		'controllers/message'        : deps: ['app', 'services/message']
		'vendor/angular-resource'    : deps: ['vendor/angular']
		'services/message'           : deps: ['app']
		'app'                        : deps: ['libs/angular', 'libs/angular-resource']
		'bootstrap'                  : deps: ['app']
		'routes'                     : deps: ['app']
		'run'                        : deps: ['app']
		'views'                      : deps: ['app']
	[
		'require'
		'controllers/message'
		'routes'
		'run'
		'views'
	], (require) ->
		angular.element(document).ready ->
			require ['bootstrap']