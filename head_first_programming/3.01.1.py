import urllib.request
import time

def get_price():
	page = urllib.request.urlopen("http://beans.itcarlow.ie/prices-loyalty.html")
	text = page.read().decode("utf8") 
	where = text.find(">$")
	sop = where+2
	eop = where+6
	return(float(text[sop:eop]))

when = input("Do you need the price immediately? (Y/N)")

if when == "Y":
	print(get_price())
else:
	price = 99.99
	target = 4.74
	while price > target:
		time.sleep(900)
		price = get_price()
	print("Buy!")


