angular.module('app').config ['$routeProvider', ($routeProvider) ->
	$routeProvider
	.when '/chat',
		controller: 'chatController'
	.otherwise
		redirectTo: '/'
]