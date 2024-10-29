def solution(numbers, direction):
    answer = []
    num = 0 
    if direction == "right":
        num = numbers[len(numbers) - 1]
        for i in range(len(numbers)-1,0,-1):
            numbers[i] = numbers[i-1]
        numbers[0] = num

    elif direction == "left":
        num = numbers[0]
        for i in range(len(numbers)-1):
            numbers[i] = numbers[i+1]
        numbers[len(numbers) - 1] = num
    answer=numbers

    return answer