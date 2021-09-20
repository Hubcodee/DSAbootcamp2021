
def numBoxex(A, n, K):

    A.sort()

    i = 0
    j = n-1
    ans = 0
    while i <= j:
        ans += 1
        if A[i]+A[j] <= K:
            i += 1
        j -= 1

    return ans


n = int(input())
A = []
for i in range(n):
    elem = int(input())
    A.append(elem)
# A = [3, 2, 2, 1]
K = int(input())
n = len(A)
print(numBoxex(A, n, K))
