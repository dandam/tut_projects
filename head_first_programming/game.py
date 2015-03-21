print("Aloha")
g = input("Pick a number between 1 and 10: ")
guess = int(g)
from random import randint
secret = randint(1, 10)
while guess != secret:
	if guess < secret:
		g = input("Too low. Guess again: ")
		guess = int(g)
	else:
		if guess > secret:
			g = input("Too high. Guess again: ")
			guess = int(g)
print("You Win!")