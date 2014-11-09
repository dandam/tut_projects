var http = require("http");
var pointer = process.argv[2];

http.get(pointer, function (response){
	response.setEncoding("utf8");
	response.on("data", console.log);
	response.on('error', console.error);
})