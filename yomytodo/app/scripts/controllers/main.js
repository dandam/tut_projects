'use strict';

/**
 * @ngdoc function
 * @name yomytodoApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the yomytodoApp
 */
angular.module('yomytodoApp')
  .controller('MainCtrl', function ($scope) {
    $scope.todos = [];
	$scope.addTodo = function () {
		$scope.todos.push($scope.todo);
		$scope.todo = '';
	};
	$scope.removeTodo = function (index) {
		$scope.todos.splice(index, 1);
	};
  });
