package AssesmentsPractice.A3007;

import java.util.Scanner;

public class ReversePalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check palindrome : ");
        String word = in.nextLine();
        String reverse = "";
        for (int i = 0; i < word.length(); i++) {
            reverse = word.charAt(i) + reverse;
        }
        if (word.equals(reverse)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}
