n = 5
inp = [1, 0, 1, 1, 1]
first = inp[0]
if first == 1:
    for i in range(1, len(inp)):
        if inp[i] == 0:
            inp[i] = 1
        elif inp[i] == 1:
            inp[i] = 0
print(inp)
