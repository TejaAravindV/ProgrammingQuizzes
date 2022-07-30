package AssesmentsPractice.A2907;

import java.util.ArrayList;
import java.util.Arrays;

public class AdditionOfLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(99);
        list1.add(88);
        list1.add(99);
        list1.add(99);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(99);
        list2.add(88);
        list2.add(99);
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();


        int size = list1.size();
        if (list1.size() < list2.size()){
            size = list2.size();
        }
        int min = list2.size();
        int max = size;
        for (int i = 0; i < min; i++) {
            int sum = list1.get(i) + list2.get(i);
            list3.add(sum);
        }
        for (int i = min; i < max; i++) {
            int sum = list1.get(i);
            list3.add(sum);
        }
        System.out.println(list3);
        int sum = 0;
        for (int i = 0; i < list3.size(); i++) {
            sum += list3.get(i);
            if (sum > 9){
                int[] arr = addToList(sum);
                list4.add(arr[0]);
                sum = arr[1];
               /*if (i == size-1){
                    list4.add(sum);
                }*/
            }else {
                list4.add(sum);
                sum=0;
            }
        }
        System.out.println(list4);

    }

    private static int[] addToList(Integer num) {
        int[] arr = new int[num.toString().length()];
        if (num < 10){
            arr[0] = num;
        }
        for (int i = 0;num > 0;i++){
            int rem = num % 10;
            if (i == 0){
                arr[i] = rem;
            }else{
                arr[i] = num;
            }
            num/=10;
        }
        System.out.println(Arrays.toString(arr));
        return arr;

    }
}