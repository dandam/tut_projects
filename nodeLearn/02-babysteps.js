/**
 * Created by dandam on 10/31/15.
 */

var inputs = process.argv;
var total = 0;

    for (var i = 2; i < inputs.length; i++) {
        total += +inputs[i];
    }

console.log(total);

// official answer below

//var result = 0
//
//for (var i = 2; i < process.argv.length; i++)
//    result += Number(process.argv[i])
//
//console.log(result)
