class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] my_stringArray = my_string.toCharArray();

        for (int i = 0; i < my_stringArray.length; i++) {
            if (!letter.equals(Character.toString(my_stringArray[i])))
                answer += my_stringArray[i];
        }
        return answer;
    }
}