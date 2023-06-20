def cover_board(board):
    polioA = 'AAAA'
    polioB = 'BB'

    # '.'을 기준으로 구분
    polio_pieces = board.split('.')

    # 주어진 보드판에 홀수 길이의 조각이 존재하는 경우 불가능하므로 -1 출력
    for piece in polio_pieces:
        if len(piece) % 2 == 1:
            return -1

    # 폴리오미노로 보드판 덮기
    covered_board = ''
    for i in range(len(polio_pieces)):
        if i > 0:
            covered_board += '.'
        if len(polio_pieces[i]) % 4 == 0:
            covered_board += polioA * (len(polio_pieces[i]) // 4)
        else:
            covered_board += polioA * (len(polio_pieces[i]) // 4)
            covered_board += polioB

    return covered_board


board = input()
result = cover_board(board)
print(result)

