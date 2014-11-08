var filter = require('./mod_filteredJS.js')
var fs = require('fs');
var path = require('path');

var filter = filter(process.argv[2], process.argv[3], function (err, file) {
	if (err) throw err;
	file.forEach(function (item) {
		console.log(item);
	})
});

// SOLUTION CODE - prettier error handling

// var filterFn = require('./solution_filter.js')
// var dir = process.argv[2]
// var filterStr = process.argv[3]
//
// filterFn(dir, filterStr, function (err, list) {
//   if (err)
//     return console.error('There was an error:', err)
//
//   list.forEach(function (file) {
//     console.log(file)
//   })
// })

