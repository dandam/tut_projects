result_f = open("results.txt")
highest_score = 0
for line in result_f:
	scr_txt = line.split(" ")
	scr_name = scr_txt[0]
	scr_num = scr_txt[1]
	if float(scr_num) > highest_score:
		highest_score = float(scr_num)
		winner = scr_name
result_f.close()
print("The highest score was: ")
print(winner)
print(highest_score)