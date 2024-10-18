class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = 0;
        int maxNumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                maxNumIndex = i;
            }
        }
        answer = new int[] { maxNum, maxNumIndex };

        return answer;
    }
}