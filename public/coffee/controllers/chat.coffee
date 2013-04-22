angular.module('app').controller 'chatController', ['$scope', 'chatService', ($scope, chatService) ->
	$scope.onRouteChange = () ->
		chatService.post($scope.message).then (results) ->
			console.log 'posted chat message'

]