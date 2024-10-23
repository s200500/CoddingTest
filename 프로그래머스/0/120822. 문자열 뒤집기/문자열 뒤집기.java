class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] my_stringIndex = my_string.toCharArray();

        for (int i = my_stringIndex.length - 1; i >= 0; i--) {
            answer += my_stringIndex[i];
        }

        return answer;
    }
}