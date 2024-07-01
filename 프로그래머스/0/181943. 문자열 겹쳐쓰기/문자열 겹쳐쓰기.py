def solution(my_string, overwrite_string, s):
    answer = ''
    a = len(my_string)
    b = len(overwrite_string)
    first=my_string[:s]
    last='';
    if(a > s+b):
        last=my_string[b+s:]
    answer = first + overwrite_string+last
    return answer