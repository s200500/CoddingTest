import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int y = 0; y < array.length - 1; y++) {
                if (array[y] > array[y + 1]) {
                    int maxNum = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = maxNum;
                }
            }
            System.out.println(Arrays.toString(array));

        }
        answer = array[array.length / 2];
        return answer;
    }
}