import urllib.request

page = urllib.request.urlopen("http://beans-r-us.biz/prices.html")
test = page.read().decode("utf8")

print(test)
