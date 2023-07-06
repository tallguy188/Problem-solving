R, C = map(int, input().split())

field = []
for _ in range(R):
    row = list(input())
    field.append(row)

for i in range(R):
    for j in range(C):
        if field[i][j] == 'W':
            if i > 0 and field[i-1][j] == '.':
                field[i-1][j] = 'D'
            if i < R-1 and field[i+1][j] == '.':
                field[i+1][j] = 'D'
            if j > 0 and field[i][j-1] == '.':
                field[i][j-1] = 'D'
            if j < C-1 and field[i][j+1] == '.':
                field[i][j+1] = 'D'

possible = True
for i in range(R):
    for j in range(C):
        if field[i][j] == 'W':
            if (i > 0 and field[i-1][j] == 'S') or (i < R-1 and field[i+1][j] == 'S') \
                    or (j > 0 and field[i][j-1] == 'S') or (j < C-1 and field[i][j+1] == 'S'):
                possible = False
                break
if possible:
    print(1)
    for row in field:
        print(''.join(row))
else:
    print(0)