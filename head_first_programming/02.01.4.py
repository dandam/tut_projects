import urllib.request
import time

price = 99.99
target = 4.74

while price > target:
	time.sleep(900)
	page = urllib.request.urlopen("http://beans.itcarlow.ie/prices-loyalty.html")
	text = page.read().decode("utf8") 
	where = text.find(">$")
	sop = where+2
	eop = where+6
	price = float(text[sop:eop])
	
print("Buy!")