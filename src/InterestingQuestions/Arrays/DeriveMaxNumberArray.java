package InterestingQuestions.Arrays;

public class DeriveMaxNumberArray {
    public static void main(String[] args) {
        int[] arr = {123,456,789,967,88,78650};
        System.out.println(getMaxNumber(arr));
    }

    private static int getMaxNumber(int[] arr) {
        String rev = "";
        for (int i = 0; i < arr.length; i++) {
            rev = getMaxFromIndex(arr[i]) + rev;
        }
        return Integer.parseInt(rev);
    }
//    private static int getMaxNumber(int[] arr) {
//
//        int rev = 0;
//        int[] num = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            num[i] = getMaxFromIndex(arr[i]);
//        }
//        return getMaxDigit(num);
//    }

   /* private static int getMaxDigit(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] < num[j]){
                   int copy = num[i];
                   num[i] = num[j];
                   num[j] = copy;
                }
            }
        }
        int max = 0;
        for (int i : num) {
            max = max*10 + i;
        }
        return max;
    }*/
   /*private static int getMaxDigit(int[] num) {
       Arrays.sort(num);
       int max = 0;
       for (int i = num.length-1; i >= 0;i--) {
           max = max*10 + num[i];
       }
       return max;
   }*/

    private static int getMaxFromIndex(int n) {
        int max = n%10;
        while(n>0){
            n/=10;
            if (max<(n%10)){
                max = n%10;
            }
        }
        return max;
    }
}
