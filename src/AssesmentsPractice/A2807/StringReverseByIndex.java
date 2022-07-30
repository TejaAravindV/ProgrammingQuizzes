package AssesmentsPractice.A2807;

import java.util.Arrays;

public class StringReverseByIndex {
    public static void main(String[] args) {
        String input = "abc def ghi yuue hghfgd gyf";
        String[] arr = input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];
            arr[i] =  reverse(temp);
        }
        String output = "";
        for (String str : arr) {
            output = output + str + " ";
        }
        System.out.println(output);
    }

    private static String reverse(String temp) {
        String output = "";
        for (int i = 0; i < temp.length(); i++) {
            output = temp.charAt(i) + output;
        }
        return output;
    }
}
