import sys
from collections import deque
input=sys.stdin.readline
print = sys.stdout.write
n,m,v=map(int,input().split())
graph=[[]for i in range(n+1)]

for i in range(m):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)


dfs_visited = [False] * (n+1)


def dfs(graph,v,dfs_visited):


    for i in range(len(graph)):
        graph[i].sort()

    dfs_visited[v] = True
    print(str(v) +  ' ')

    for i in graph[v]:
        if not dfs_visited[i]:
            dfs(graph,i,dfs_visited)

bfs_visited = [False] * (n+1)
def bfs(graph,start,bfs_visited):
    for i in range(len(graph)):
        graph[i].sort()
    queue = deque([start])

    bfs_visited[start] = True

    while queue:
        v = queue.popleft()
        print(str(v) +  ' ')

        for i in graph[v]:
            if not bfs_visited[i]:
                queue.append(i)
                bfs_visited[i] = True



dfs(graph,v,dfs_visited)
print("\n")
bfs(graph,v,bfs_visited)




