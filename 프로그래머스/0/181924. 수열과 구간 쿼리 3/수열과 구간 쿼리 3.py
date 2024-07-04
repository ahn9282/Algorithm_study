def solution(arr, queries):
    answer = arr
    for i in queries:
        temp = arr[i[0]]
        arr[i[0]] = arr[i[1]]
        arr[i[1]] = temp
    return answer