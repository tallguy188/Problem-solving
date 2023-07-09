import sys

input = sys.stdin.readline
print = sys.stdout.write
n = int(input())
m = int(input())

graph = [[] for i in range(n+1)]

for i in range(m):
    a,b = map(int,input().split())

    graph[a].append(b)
    graph[b].append(a)

visited = [False] * (n+1)
result = []
def dfs(graph,v,visited):
    visited[v] = True
    result.append(v)

    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)

dfs(graph,1,visited)

num = len(result)-1

print(str(num))
