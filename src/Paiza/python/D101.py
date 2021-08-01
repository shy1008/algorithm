num1,num2 = map(int,input().split())

even = num1 % 2
odd = num2 % 2

print(even)
print(odd)

if even == 0 and odd == 0:
    print("NO")
elif even != 0 and odd != 0:
    print("NO")
else:
    print("YES")
