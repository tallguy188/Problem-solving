n = int(input())
m = list(map(int,input().split()))
for i in range(n):
	m[i]

sm = sum(m)

print((sm/n)/max(m)*100)
