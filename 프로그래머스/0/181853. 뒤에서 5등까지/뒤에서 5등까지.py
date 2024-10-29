def solution(num_list):
    answer = []
    n = len(num_list)

    for i in range(n - 1):  # 파이썬 버블정렬
        for j in range(i + 1, n):
            if num_list[i] > num_list[j]:
                num_list[i], num_list[j] = num_list[j], num_list[i]

    for i in range(5):
        answer.append(num_list[i])

    return answer