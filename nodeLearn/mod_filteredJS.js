var fs = require('fs');
var path = require('path');

module.exports = function filter (directory, extension, callback) {
	fs.readdir(directory, function (err, list) {
		if(err)
			return callback(err)
		
		var myarray = [];
		list.forEach(function (file) {
			if (path.extname(file) === "." + extension) {
				myarray.push(file);
			}
		})
		callback(err, myarray);
	})
}

// SOLUTION CODE - above passed but array is probably handled better below

// var fs = require('fs')
// var path = require('path')
//
// module.exports = function (dir, filterStr, callback) {
//
//   fs.readdir(dir, function (err, list) {
//     if (err)
//       return callback(err)
//
//     list = list.filter(function (file) {
//       return path.extname(file) === '.' + filterStr
//     })
//
//     callback(null, list)
//   })
// }
