import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "";

        for (int i = 1; i < n + 2; i++) {
            for (int j = 1; j < i + 1; j++) {
                answer += "*";
            }
            if (i == n) {
                break;
            }
            answer += "\n";
        }

        System.out.println(answer);
    }
}