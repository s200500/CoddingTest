class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] myStringArrayString = myString.split("");
        for (String string : myStringArrayString) {
            if (string.equals("A") || string.equals("a"))
                answer += string.toUpperCase();
            else
                answer += string.toLowerCase();
        }

        return answer;
    }
}