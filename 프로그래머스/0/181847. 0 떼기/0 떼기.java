class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] n_strArray = n_str.toCharArray();

        for (char c : n_strArray) {
            if (c != '0' || answer != "")
                answer += c;
        }
        return answer;
    }
}