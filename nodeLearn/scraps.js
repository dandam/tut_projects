function four(result) {
	dataOne = result[0][1];
	dataTwo = result[1][1];
	dataThree = result[2][1];
	
	bl.append(new Buffer(dataOne));
	bl.append(new Buffer(dataTwo));
	bl.append(new Buffer(dataThree));
	
	console.log(bl.toString());
	
}

function trying(async_calls, shared_callback) {
	var counter = async_calls.length;
	var all_results = [];
	function makeCallback(index){
		return function() {
			counter --;
			var results = [];
		}
		
		for (var i = 0; i < arguments.length; i++) {
			results.push(arguments[i]);
		}
		all_results[index] = results;
		if (counter == 0) {
			shared_callback(all_results);
		}
	}
	for (var i = 0; i < async_calls.length; i++) {
		async_calls[i](makeCallback(i))
	}
}
