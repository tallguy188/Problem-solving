from collections import deque
import sys
input = sys.stdin.readline

n = int(input())

moneydeq = deque()
# 입력 n이 10만까지도 가능하므로 리스트 인덱스로 비교하면서 풀면 안된다. 데크사용여부 확인

for _ in range(n):
    k = int(input())
    if k != 0:
        moneydeq.append(k)
    else:
        abandoned = moneydeq.pop()

result = 0
print = sys.stdout.write
if moneydeq:
    for v in moneydeq:
        result += v
    print(str(result))
else:
    print(str(0))

