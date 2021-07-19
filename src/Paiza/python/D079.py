s1 = input()
check = False

for i in s1:
    if i == s1[0]:
        check = False
    else:
        check = True

if check :
    print("OK")
else:
    print("NG")