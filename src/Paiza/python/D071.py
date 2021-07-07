# 세탁물과 먼지
# 파이썬에 논리 연산자에 대해 공부했다.
temp, opreate = map(int, input().split())

if temp >= 25 and opreate <= 60:
    print("Yes")
elif opreate <= 20:
    print("Yes")
else:
    print("No")

