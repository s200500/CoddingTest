class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        char[] targetArray = target.toCharArray();
        char[] my_stringArray = my_string.toCharArray();
        int endCount = 0;

        for (char c : my_stringArray) {
            if (c == targetArray[endCount]) {
                endCount++;
            } else {
                endCount = 0;
                if (c == targetArray[endCount]) {
                    endCount++;
                }
            }

            if (endCount == targetArray.length) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}