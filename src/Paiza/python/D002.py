one,two = map(int, input().split())

if one > two:
    print(one)
elif two > one:
    print(two)
else:
    print("eq")