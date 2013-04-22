angular.module('app').service 'chatService', ['$scope', '$http', ($scope, $http) ->

	@post = () =>
		$http.post('/chat')
]