import java.math.BigDecimal;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private BigDecimal salary;

    public Employee(int id, String name, int age, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary;
    }


    @Override
    public int compareTo(Employee o) {
        return salary.compareTo(o.salary);
    }
}
