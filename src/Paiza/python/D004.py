num = int(input())
s = []
s.append("Hello ")

for i in range(0,num):
    s2 = input()
    if i == num-1:
        s.append(s2+".")
    else:
        s.append(s2+",")

s = ''.join(s)
print(s)