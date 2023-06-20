

n, m = map(int,input().split())  # n, m값을 입력받음

n_set = set(input() for _ in range(n))

m_set = set(input() for _ in range(m))

# 집합을 리스트로 변환
nm_set = sorted(list(n_set.intersection(m_set)))




print(len(nm_set))
for name in nm_set:
    print(name)
