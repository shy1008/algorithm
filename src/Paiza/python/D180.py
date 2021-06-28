# 소리의 신음

# 입력값을 정수로 변환하기
# instrument1, instrument2 = input().split(" ")
# instrument1 = int(instrument1)
# instrument2 = int(instrument2)

# map을 사용하여 정수로 변환하기(실수로 변환할때는 int 대신 float를 넣는다)
instrument1, instrument2 = map(int, input().split())

if instrument1 > instrument2:
    print(instrument1 - instrument2)
else:
    print(instrument2 - instrument1)
