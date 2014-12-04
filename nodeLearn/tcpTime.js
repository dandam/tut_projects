var port = process.argv[2];
var net = require('net');
var strftime = require('strftime');
var server = net.createServer(function(socket){
	var stamp = strftime('%F %H:%M');
	socket.end(stamp);
})
server.listen(port);
