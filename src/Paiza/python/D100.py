# 100점
sc = input()

ch1 = '_'
ch2 = '-'

count1 = 0
count2 = 0

for i in sc:
    if i == ch1:
        count1 += 1
    elif i == ch2:
        count2 += 1

if count1 > count2:
    print(sc.replace('-','_'))
elif count2 > count1:
    print(sc.replace('_','-'))
else:
    print(sc.replace('-','_'))
