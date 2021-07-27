# 파이썬에서는 int / int를 해도 값이 double로 나온다. 코틀린과다르다.
# 문자열출력에서도 애먹었다. 코틀린은 문자열사이에 변수를 넣기가 쉬웠는데 파이썬 같은경우 포맷을 이용해서 적용했다.
x,y,p = map(int, input().split())
x2,y2,p2 = map(int, input().split())

one = p / (x * y)
two = p2 / (x2 * y2)

if one > two:
    print('{0} {1} {2}'.format(x2,y2,p2))
elif two > one:
    print('{0} {1} {2}'.format(x,y,p))
else:
    print("DRAW")

# print(x,y,p)
# print(x2,y2,p2)


