print("Aloha")
guess = 0
from random import randint
secret = randint(1, 10)
while guess != secret:
	g = input("Pick a number between 1 and 10: ")
	guess = int(g)
	if guess < secret:
		print("Too low.")
	else:
		if guess > secret:
			print("Too high.")
print("You Win!")