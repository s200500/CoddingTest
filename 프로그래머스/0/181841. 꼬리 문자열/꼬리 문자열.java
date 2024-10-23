class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        char[] strToChar = ex.toCharArray();
        int endCount = 0;

        for (String string : str_list) {
            boolean check = true;
            char[] str_listArray = string.toCharArray();
            for (char c : str_listArray) {
                if (c == strToChar[endCount]) {
                    endCount++;
                } else {
                    endCount = 0;
                }
                if (endCount == strToChar.length) {
                    check = false;
                    endCount = 0;
                }
            }
            if (check) {
                answer += string;
            }
        }

        return answer;
    }
}