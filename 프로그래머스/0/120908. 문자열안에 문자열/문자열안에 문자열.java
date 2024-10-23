class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        int endCount = 0;

        for (char c : str1Array) {
            if (c == str2Array[endCount]) {
                endCount++;
            } else {
                endCount = 0;
            }
            if (endCount == str2Array.length) {
                answer = 1;
                break;
            }
            System.out.println(endCount);
        }

        return answer;
    }
}