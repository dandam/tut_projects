
var babySteps = process.argv;
var total=0;
for (var i = 2; i < babySteps.length; i++){
	total += +babySteps[i];
};
console.log(total);
