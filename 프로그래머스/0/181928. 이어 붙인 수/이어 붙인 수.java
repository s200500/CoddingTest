class Solution {
    public int solution(int[] num_list) {
        String evenNumStr = "";
        String oddNumStr = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNumStr += num_list[i];
            } else {
                oddNumStr += num_list[i];
            }
        }
        int answer = Integer.parseInt(evenNumStr) + Integer.parseInt(oddNumStr);

        return answer;
    }
}