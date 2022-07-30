package AssesmentsPractice.A2907;

public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println(getSumOfDigits(46511));
    }

    private static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        if (sum < 10){
            return sum;
        }
        return getSumOfDigits(sum);
    }
}
