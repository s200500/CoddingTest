def solution(n):
    answer = 0
    nArray = [int(i) for i in str(n)]
    for i in range(len(nArray)):
        answer += nArray[i]

    return answer