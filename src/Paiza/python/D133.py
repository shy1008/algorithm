yen = int(input())
stock = int(input())
profit = int(input())

benefit = int(profit * (yen/stock))
mystock = int(stock * (yen/stock))

print(benefit-mystock)