class Solution {
    public int solution(String my_string) {
        int answer = 0;

        char[] my_string_array = my_string.toCharArray();
        for (int i = 0; i < my_string_array.length; i++) {
            if (my_string_array[i] > '0' && my_string_array[i] <= '9') {
                answer += ((int) my_string_array[i]) - 48;
            }
        }
        return answer;
    }
}