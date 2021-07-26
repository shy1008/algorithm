s1 = input()
check = True

for i in s1:
    if s1[0] != i:
        check = False

if check:
    print(s1)
else:
    print("No")
