package AssesmentsPractice.A2907;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(285654));
    }

    private static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
