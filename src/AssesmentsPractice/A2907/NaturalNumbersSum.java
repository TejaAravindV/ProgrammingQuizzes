package AssesmentsPractice.A2907;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(100));
    }

    private static int sumOfNaturalNumbers(int num) {
        if (num == 0) {
            return num;

        }
        return num + sumOfNaturalNumbers(num - 1);
    }
}