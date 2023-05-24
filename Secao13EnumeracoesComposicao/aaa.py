num = 9
p = 0
i = 0
while(num > 0):
    if num % 2 == 0:
        p = p + 1
    else:
        i = i + 1
    num = num - 1

print(p)
print(i)