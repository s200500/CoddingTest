class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] num_strArray = num_str.toCharArray();

        for (char c : num_strArray) {
            answer += c - '0';
        }
        return answer;
    }
}