import sys

n = int(sys.stdin.readline())

observations = {}
count = 0

for _ in range(n):
    number, position = map(int, sys.stdin.readline().split())
    if number in observations:
        if observations[number] != position:
            count += 1
            observations[number] = position
    else:
        observations[number] = position

print(count)