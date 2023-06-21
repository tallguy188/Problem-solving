n = int(input())  # 배달해야 할 설탕의 무게

# 5킬로그램 봉지로 배달 가능한 최대 개수를 구한다
count = n // 5


# 남은 무게를 3킬로그램 봉지로 배달할 수 있는지 확인한다
while count >= 0:
    remainder = n - (count * 5)  # 5킬로그램 봉지로 배달한 후 남은 무게
    if remainder % 3 == 0:  # 3킬로그램 봉지로 배달 가능한 경우
        count += remainder // 3
        break
    count -= 1

# 결과 출력
if count >= 0:
    print(count)
else:
    print(-1)