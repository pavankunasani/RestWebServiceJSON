<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<body ng-app="myApp" ng-controller="myCtrl">

<h2>Hello World!</h2>

 <h1>{{myWelcome}}</h1>
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
  $http.get("http://localhost:8086/RestWebServiceJSON/employees")
  .then(function(response) {
	  alert("test");
      $scope.myWelcome = response.data;
  });
});
</script> 
</body>
</html>
