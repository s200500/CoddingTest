class Solution {
    public int solution(String my_string) {
        int answer = 0;

        char[] my_string_array = my_string.toCharArray();

        for (int i = 0; i < my_string_array.length; i++) {
            if (my_string_array[i] == '1' ||
                    my_string_array[i] == '2' ||
                    my_string_array[i] == '3' ||
                    my_string_array[i] == '4' ||
                    my_string_array[i] == '5' ||
                    my_string_array[i] == '6' ||
                    my_string_array[i] == '7' ||
                    my_string_array[i] == '8' ||
                    my_string_array[i] == '9') {
                System.out.println(my_string_array[i]);
                answer += ((int) my_string_array[i]) - 48;
            }
        }

        return answer;
    }
}