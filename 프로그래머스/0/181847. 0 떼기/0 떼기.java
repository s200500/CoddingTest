class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] n_strArray = n_str.toCharArray();
        boolean check = false;

        for (char c : n_strArray) {
            if (c != '0' || check == true) {
                answer += c;
                check = true;
            }
        }
        return answer;
    }
}