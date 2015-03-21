import urllib.request

page = urllib.request.urlopen("http://beans.itcarlow.ie/prices-loyalty.html")
text = page.read().decode("utf8") 

where = text.find(">$")
sop = where+2
eop = where+6
price = text[sop:eop]

print(price)