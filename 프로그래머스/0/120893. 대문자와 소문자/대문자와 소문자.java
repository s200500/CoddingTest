class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] my_string_array = my_string.toCharArray();

        for (int i = 0; i < my_string_array.length; i++) {
            if (my_string_array[i] > 95) {
                my_string_array[i] = (char) (my_string_array[i] - 32);

            } else {
                my_string_array[i] = (char) (my_string_array[i] + 32);
            }
            answer += my_string_array[i];
        }
        return answer;
    }
}