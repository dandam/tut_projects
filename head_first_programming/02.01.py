import urllib.request

page = urllib.request.urlopen("http://beans.itcarlow.ie/prices-loyalty.html")
text = page.read().decode("utf8") 

dollarSign = text.find(">$")
price = text[dollarSign+2:dollarSign+6]

print(price)