scores = {}
result_f = open("results.txt")
for line in result_f:
	(scrname, scrnum) = line.split(" ")
	scores[scrnum] = scrname
result_f.close()

print("The top scores were:")
for each_scrnum in sorted(scores.keys(), reverse = True):
	print('Surfer ' + scores[each_scrnum] + ' scored ' + each_scrnum)