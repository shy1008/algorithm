n, m, k = map(int, input().split())
randomList = list(map(int, input().split()))

randomList.sort() 

count = int(m / (k + 1)) * k
count += m % (k + 1)
# print("count = ", count)

result = 0
result += (count) * randomList[n - 1] 
result += (m - count) * randomList[n - 2] 
# print("randomList[n - 1] = ", randomList[n - 1])
# print("randomList[n - 2] = ", randomList[n - 2])

print(result) 