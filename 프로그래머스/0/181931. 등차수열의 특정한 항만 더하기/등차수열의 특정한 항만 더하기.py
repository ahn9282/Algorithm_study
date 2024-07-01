def solution(a, d, included):
    answer = 0
    indexs = [index for index, value in enumerate(included) if value]
    for i in indexs:
        answer += a + (i)*d
    return answer