var pointers = process.argv;
var http = require("http");
//const BufferList = require('bl');
//var bl = new BufferList();
var bull = require('bl');
var results = [];
var count = 0;

function logIt(){
	for (var i = 2; i < pointers.length; i++) {
		console.log(results[i]);
	}
}

function getIt(index) {
	http.get(pointers[index], function (response){
		response.pipe(bull(function (err, data){
			if (err)
				return console.log("big old error");
			results[index] = data.toString()
			++count;
			if (count == 3){
				logIt();
			}
		}));
	});
}

for (var i = 2; i < pointers.length; i++) {
	getIt(i);
}


/* BRUTE FORCE - INELEGANT BUT SUCCESSFUL */

function one() {
	http.get(pointers[2], function (response){
		response.pipe(bull(function (err, data){
			if (err)
				return console.log("big old error");
			data = data.toString()
			console.log(data);
			two();
		}));
	});
}

function two() {
	http.get(pointers[3], function (response){
		response.pipe(bull(function (err, data){
			if (err)
				return console.log("big old error");
			data = data.toString()
			console.log(data);
			three();
		}));
	});
}

function three() {
	http.get(pointers[4], function (response){
		response.pipe(bull(function (err, data){
			if (err)
				return console.log("big old error");
			data = data.toString()
			console.log(data);
		}));
	});
}

// one();

// Here's the official solution in case you want to compare notes:

    // var http = require('http')
    // var bl = require('bl')
    // var results = []
    // var count = 0

    function printResults () {
      for (var i = 0; i < 3; i++)
        console.log(results[i])
    }

    function httpGet (index) {
      http.get(process.argv[2 + index], function (response) {
        response.pipe(bl(function (err, data) {
          if (err)
            return console.error(err)

          results[index] = data.toString()
          count++

          if (count == 3) // yay! we are the last one!
            printResults()
        }))
      })
    }

    for (var i = 0; i < 3; i++)
 //     httpGet(i)

