def find_most_common_letter(word):
    # 문자열을 소문자로 변환하여 대소문자 구분을 없앱니다.
    word = word.lower()

    # 알파벳의 등장 횟수를 저장할 딕셔너리를 생성합니다.
    letter_counts = {}

    # 문자열을 순회하며 알파벳의 등장 횟수를 계산합니다.
    for letter in word:
        # 알파벳이 이미 딕셔너리에 등록되어 있는 경우 등장 횟수를 1 증가시킵니다.
        if letter.isalpha():
            if letter in letter_counts:
                letter_counts[letter] += 1
            else:
                letter_counts[letter] = 1

    # 가장 많이 사용된 알파벳들을 찾습니다.
    max_count = max(letter_counts.values())
    most_common_letters = [letter.upper() for letter, count in letter_counts.items() if count == max_count]

    # 가장 많이 사용된 알파벳이 여러 개인 경우 "?"를 출력합니다.
    if len(most_common_letters) > 1:
        return "?"
    else:
        return most_common_letters[0]


# 사용자로부터 알파벳으로 된 단어를 입력받습니다.
word = input()

# 가장 많이 사용된 알파벳을 찾습니다.
most_common = find_most_common_letter(word)

# 결과를 출력합니다.
print( most_common)

