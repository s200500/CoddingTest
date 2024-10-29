def solution(rny_string):
    answer = ""
    rny_stringArray = [str for str in rny_string]

    for str in rny_stringArray:
        if str == "m":
            answer += "rn"
        else:
            answer += str
    return answer