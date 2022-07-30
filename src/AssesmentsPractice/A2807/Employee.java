package AssesmentsPractice.A2807;

import java.util.Objects;

public class Employee {
    private Integer empId;
    private String name;
    private Integer salary;

    public Employee(Integer empId, String name, Integer salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId.equals(employee.empId);
   }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId.equals(employee.empId) && name.equals(employee.name) && salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, salary);
    }
}
