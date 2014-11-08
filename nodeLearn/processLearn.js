
var babySteps = process.argv;
var total=0;
for (var i = babySteps.length - 1; i >= 2; i--){
	total += +babySteps[i];
};
console.log(total);
