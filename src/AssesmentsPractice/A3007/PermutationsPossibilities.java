package AssesmentsPractice.A3007;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsPossibilities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value: ");
        String value = in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        char[] arr = value.toCharArray();
       /* int v1 = value.length() - 1;
        int v2 = v1 - 1;
        String result = "";
        int v3 = 0;
        while (!value.equals(result)) {

            if (v2 == -1) {
                v1 = value.length() - 1;
                v2 = v1 - 1;
                v3 = 0;
            }
            if (v2 == 0) {
                v3 = value.length() - 1;
            }
            if (result.isEmpty()) {
                result = value;
            }
            result = swap(list, result, v1, v2, v3);
            v1--;
            v2--;
        }*/
        while (!list.contains(value)){
            list = swap(list,arr);
        }
        System.out.println(list);
        System.out.println(list.size());
    }

    private static String convertArrayToString(char[] arr) {
        String str = "";
        for (char ch : arr) {
            str += ch;
        }
        return str;
    }

    private static ArrayList<String> swap(ArrayList<String> list,char[] arr) {
        String result = "";
        for (int i = arr.length - 1; i > 0; i--) {
            char temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            result = convertArrayToString(arr);
            if (!list.contains(result)){
                list.add(result);
            }
        }
        return list;
    }

    private static String swap(ArrayList<String> list, String value, int v1, int v2, int v3) {
        int temp = v1;
        v1 = v2;
        v2 = temp;
        String result = (v3 == 0) ? "" + value.charAt(v3) + value.charAt(v2) + value.charAt(v1) : "" + value.charAt(v2) + value.charAt(v1) + value.charAt(v3);
        list.add(result);
        return result;
    }
}
