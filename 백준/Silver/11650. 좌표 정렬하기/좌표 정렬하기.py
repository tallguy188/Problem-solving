import sys
n = int(sys.stdin.readline())
xy= []

for _ in range(n):
    data = sys.stdin.readline().split()
    x = int(data[0])
    y = int(data[1].rstrip())
    xy.append(([x,y]))

xy.sort(key=lambda x: (x[0], x[1]))


for k in xy:
    sys.stdout.write(str(k[0]) + " " + str(k[1]) + "\n")
