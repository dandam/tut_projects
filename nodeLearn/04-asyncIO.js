/**
 * Created by dandam on 10/31/15.
 */

var fs = require('fs');
var result = undefined;

fs.readFile(process.argv[2], "utf8", function countLines (err, lines){
    result = lines.split("\n").length - 1;
    logResult()
});

function logResult() {
    console.log(result);
}

/* OFFICIAL ANSWER */
//
//var fs = require('fs')
//var file = process.argv[2]
//
//fs.readFile(file, function (err, contents) {
//    // fs.readFile(file, 'utf8', callback) can also be used
//    var lines = contents.toString().split('\n').length - 1
//    console.log(lines)
//})