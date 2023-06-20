i = 1
a = []
while i<=9 : 
	N = int(input())
	a.append(N)
	if (len(a)==9):
		break

print(max(a))
print(a.index(max(a))+1)
