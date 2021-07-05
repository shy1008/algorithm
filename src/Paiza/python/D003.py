# 곱하기 목록
# 맨뒤에 공백 제거
num = int(input())

for i in range(1, 10):
    if i != 9:
        print(num * i, end=" ")
    else:
        print(num * i)
