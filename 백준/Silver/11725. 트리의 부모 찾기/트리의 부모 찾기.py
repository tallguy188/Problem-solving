import sys
from collections import deque
input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

graph = [[] for i in range(n+1)]


for i in range(n-1):
    a,b = map(int,input().split())

    graph[a].append(b)
    graph[b].append(a)

visited = [False] * (n+1)

parents = [0] * (n+1)

def bfs(graph,start,visited):

    queue = deque([start])
    visited[start] = True
    while queue:
        recent = queue.popleft()
        for adj_node in graph[recent]:
            if not visited[adj_node]:
                queue.append(adj_node)
                visited[adj_node] = True
                parents[adj_node] = recent


bfs(graph,1,visited)

for i in range(2,n+1):
    print(str(parents[i]) + '\n')


