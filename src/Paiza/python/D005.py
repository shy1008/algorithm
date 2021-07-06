
# 산술 급수
# 등차 수열 = 인접한 수의 차이가 같은 수의 나열
s1,s2 = map(int, input().split())

for i in range(0,10):
    if i != 10 :
        print(s1,end=" ")
    else:
        print(s1,end="")
    s1 = s1 + s2



