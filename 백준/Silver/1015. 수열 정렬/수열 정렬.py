import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

a = list(map(int, input().strip().split()))
# a = (2,1,3,1)
#sorted_a = (1,1,2,3)
# p = 2 0 3 1
arrange_a = sorted(a)

# 배열 b는 a를 오름차순으로 정렬한 것과 같음.

p = []

for i in range(n):
    for j in range(n):
        if a[i] == arrange_a[j]:
            index = j
            if j not in p:
                p.append(j)
                break


for num in p:
    print(str(num) + ' ')





