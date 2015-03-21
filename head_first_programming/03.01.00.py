import urllib.request
# import time

# price = 99.99
# target = 4.74


def get_price():
	page = urllib.request.urlopen("http://beans.itcarlow.ie/prices-loyalty.html")
	text = page.read().decode("utf8") 
	where = text.find(">$")
	sop = where+2
	eop = where+6
	return(float(text[sop:eop]))

# while price > target:
	# time.sleep(9)
price = get_price()	
print(price)

