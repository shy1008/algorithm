m, d = input().split()

first = m[0]
same = False

for i in m:
    for j in d:
        if j != first:
            same = False
        else:
            same = True
    if i != first:
        same = False
    else:
        same = True

if same:
    print("Yes")
else:
    print("No")
