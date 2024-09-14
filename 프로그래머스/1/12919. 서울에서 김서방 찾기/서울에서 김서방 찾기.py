def solution(seoul):
    index = 0
    for i in seoul:
        if i == "Kim":
            break
        index += 1
    return f"김서방은 {index}에 있다"