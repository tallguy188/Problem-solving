from collections import deque
import sys

def find_last_word(n):
    dec = deque(range(1, n + 1))

    while len(dec) > 1:
        dec.popleft()
        moved_element = dec.popleft()
        dec.append(moved_element)

    return dec[0]

n = int(sys.stdin.readline())

result = find_last_word(n)
print = sys.stdout.write

print(str(result))
