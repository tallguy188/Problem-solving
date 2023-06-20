lst = []
count = 0

for i in range(0,10):
	n = int(input())
	lst.append(n%42)
	
for i in range(42):
	if i in lst:
		count = count+1
	else:
		pass
		
print(count)