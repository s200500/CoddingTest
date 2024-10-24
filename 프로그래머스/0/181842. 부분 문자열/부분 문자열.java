class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        int endCount = 0;

        for (char c : str2Array) {
            if (c == str1Array[endCount]) {
                endCount++;
            } else {
                endCount = 0;
                if (c == str1Array[endCount]) {
                    endCount++;
                }
            }

            if (endCount == str1Array.length) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}