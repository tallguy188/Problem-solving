import sys

def push(stack, x):
    stack.append(x)

def pop(stack):
    if not stack:
        return -1
    return stack.pop()

def size(stack):
    return len(stack)

def empty(stack):
    return 1 if not stack else 0

def top(stack):
    if not stack:
        return -1
    return stack[-1]

if __name__ == "__main__":
    N = int(sys.stdin.readline())
    stack = []

    for _ in range(N):
        command = sys.stdin.readline().split()
        if command[0] == "push":
            push(stack, int(command[1]))
        elif command[0] == "pop":
            print(pop(stack))
        elif command[0] == "size":
            print(size(stack))
        elif command[0] == "empty":
            print(empty(stack))
        elif command[0] == "top":
            print(top(stack))
