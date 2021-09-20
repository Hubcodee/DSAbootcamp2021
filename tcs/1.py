# inp = int(input())
inp = "11101111"
l = []
l[:0] = inp
first = l[0]
last = inp.rfind(l[0])
count = 0
for i in range(1, last):
    count += 1

print(first)
print(last)
print(count)
# for i in l:
