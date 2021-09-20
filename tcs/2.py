inp = "abcddba"
a = []
a[:0] = inp
ls = []
ls1 = []
for i in range(0, len(a)-1):
    if a.count(a[i]) % 2 == 0:
        ls.append(a[i])
    else:
        ls1.append(a[i])

print(ls)
print(ls1)
print(len(ls1))
