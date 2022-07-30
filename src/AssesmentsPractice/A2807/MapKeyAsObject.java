package AssesmentsPractice.A2807;

import java.util.HashMap;
import java.util.Map;

public class MapKeyAsObject {
    public static void main(String[] args) {
        Map<Employee,Integer> map = new HashMap<>();
        Employee employee1 = new Employee(100,"sai",10000);
        //Employee employee2 = new Employee(100,"sai",10000);
       Employee employee2 = new Employee(100,"sai",10000);
        Employee employee3 = new Employee(103,"sam",15000);
        Employee employee4 = new Employee(104,"john",14000);
        Employee employee5 = new Employee(105,"tom",12000);
        map.put(employee1,employee1.getSalary());
        map.put(employee2,employee2.getSalary());
        map.put(employee3,employee3.getSalary());
        map.put(employee4,employee4.getSalary());
        map.put(employee5,employee5.getSalary());
        for (Map.Entry<Employee,Integer> item : map.entrySet()) {
            System.out.println(item.getKey().getName()+ " : " + item.getValue());

        }


    }
}
