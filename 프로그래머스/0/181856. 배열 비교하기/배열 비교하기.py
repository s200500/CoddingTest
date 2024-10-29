def solution(arr1, arr2):
    answer = 0

    if(len(arr1) > len(arr2)):
        answer =1
    elif(len(arr2) > len(arr1)):
        answer =-1
    else:
        arr1Sum = sum(arr1)
        arr2Sum = sum(arr2)
        if arr1Sum > arr2Sum:
            answer = 1
        elif arr2Sum > arr1Sum:
            answer = -1
        else:
            answer = 0

    return answer