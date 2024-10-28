class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for (int i = 0; i < my_strings.length; i++) {
            String[] my_stringsArray = my_strings[i].split("");
            for (int j = parts[i][0]; j <= parts[i][1]; j++) {
                answer += my_stringsArray[j];
            }
        }

        return answer;
    }
}