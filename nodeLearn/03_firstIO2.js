/**
 * Created by dandam on 10/31/15.
 */

var fs = require('fs');
var path = process.argv[2];

var stuff = fs.readFileSync(path).toString().split("\n");

console.log(stuff.length - 1);

/* OFFICIAL SOLUTION BELOW */

//var fs = require('fs')
//
//var contents = fs.readFileSync(process.argv[2])
//var lines = contents.toString().split('\n').length - 1
//console.log(lines)

// note you can avoid the .toString() by passing 'utf8' as the
// second argument to readFileSync, then you'll get a String!
//
// fs.readFileSync(process.argv[2], 'utf8').split('\n').length - 1
