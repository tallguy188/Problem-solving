

n = int(input())

num = 665
count = 0
while True:
    num +=1
    # num값을 리스트로 변환한다.

    if '666' in str(num):
        count += 1
    if count == n:
        break

print(num)
