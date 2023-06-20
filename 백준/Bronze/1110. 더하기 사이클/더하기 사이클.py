count = 0
old =  int(input())
N = old

while True:
	result = (N // 10) + (N % 10)
	N = (N % 10) * 10 + (result % 10)
	count = count +1
		
	if(N == old):
		break
		
print(count)