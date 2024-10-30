def solution(myString, pat):
    answer = 0
    
    myString = myString.replace("A","@").replace("B","A").replace("@", "B")

    if (pat in myString):
        answer = 1
    return answer