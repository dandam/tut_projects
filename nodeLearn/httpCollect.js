var pointer = process.argv[2];
var http = require("http");
var bl = require('bl');

http.get(pointer, function (response){
	response.pipe(bl(function (err, data){
		if (err)
			return console.log("big old error");
		data = data.toString()
		console.log(data.length);
		console.log(data);
	}));
})