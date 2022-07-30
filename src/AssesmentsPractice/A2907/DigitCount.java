package AssesmentsPractice.A2907;

public class DigitCount {
    public static void main(String[] args) {
        System.out.println(digitCount(456948467));
    }

    private static int digitCount1(int num) {
        return (int) Math.log10(num) + 1;
    }

    private static int digitCount(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
