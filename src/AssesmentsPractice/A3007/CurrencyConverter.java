package AssesmentsPractice.A3007;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class CurrencyConverter {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("eur",79.82);
        map.put("usd",80.12);
        map.put("chf",81.21);
        map.put("gbp",94.32);
        map.put("kwd",260.0);
        map.put("omr",208.18);
        map.put("cny",11.82);
        map.put("cad",62.15);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Currency Name : ");
        String input = in.nextLine();
        System.out.println("Enter the value of Currency: ");
        Double value = Double.parseDouble(in.nextLine());
        System.out.println("Enter the Currency to be converted into : ");
        String output = in.nextLine();
        value = convertCurrency(map,input,output,value);
        System.out.println(value);

    }

    private static Double convertCurrency(Map<String, Double> map, String input, String output, Double value) {
        Double result = 0.0;
        Double res1 = 0.0;
        Double res2 = 0.0;
        for (Map.Entry<String, Double> entry: map.entrySet()) {
            if (output.equalsIgnoreCase(entry.getKey())){
                res1 = entry.getValue();
            }
            if (input.equalsIgnoreCase(entry.getKey())){
                res2 = entry.getValue();
            }
        }
        return result;

    }


}
