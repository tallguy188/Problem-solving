import sys

input = sys.stdin.readline

n = int(input())


a = list(map(int,input().strip().split()))

b = list(map(int,input().strip().split()))


a.sort()
arrange_b = sorted(b,reverse=True)

result = 0
for i in range(n):
    add = a[i] * arrange_b[i]
    result +=add

print(result)