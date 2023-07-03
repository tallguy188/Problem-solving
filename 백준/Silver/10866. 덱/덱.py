import sys
from collections import deque

deq = deque()

n = int(sys.stdin.readline())

for _ in range(n):
    command = sys.stdin.readline().split()

    if command[0] == 'push_front':
        deq.appendleft(int(command[1]))
    elif command[0] == 'push_back':
        deq.append(int(command[1]))
    elif command[0] == 'pop_front':
        if deq:
            sys.stdout.write(str(deq.popleft()) + '\n')
        else:
            sys.stdout.write('-1\n')
    elif command[0] == 'pop_back':
        if deq:
            sys.stdout.write(str(deq.pop()) + '\n')
        else:
            sys.stdout.write('-1\n')
    elif command[0] == 'size':
        sys.stdout.write(str(len(deq)) + '\n')
    elif command[0] == 'empty':
        if deq:
            sys.stdout.write('0\n')
        else:
            sys.stdout.write('1\n')
    elif command[0] == 'front':
        if deq:
            sys.stdout.write(str(deq[0]) + '\n')
        else:
            sys.stdout.write('-1\n')
    elif command[0] == 'back':
        if deq:
            sys.stdout.write(str(deq[-1]) + '\n')
        else:
            sys.stdout.write('-1\n')