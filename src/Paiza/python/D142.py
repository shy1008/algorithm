import math

# [캠페인 문제] 일루미네이션의 수
N,X,Y = map(float,input().split())

print( int(math.ceil(N/X)) * int(Y))