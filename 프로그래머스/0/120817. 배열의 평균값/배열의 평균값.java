class Solution {
    public double solution(int[] numbers) {
        int totalNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            totalNum += numbers[i];
        }

        double answer = (double) totalNum / numbers.length;

        return answer;
    }
}