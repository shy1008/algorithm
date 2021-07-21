count = int(input())

arr = []
sum = 0

for i in range(0,count):
    arr.append(int(input()))

for j in arr:
    sum = sum + j

print(sum/count)