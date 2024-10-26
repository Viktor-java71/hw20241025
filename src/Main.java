import java.math.BigDecimal;
import java.util.Arrays;

/*
# 1
1. Создать класс Employee c полями id, name, age, salary.
2. Сделать его Comparable по salary (по зарплате)
3. Создайте массив объектов Employee и отсортируйте его по зарплате

 */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1,"Jack", 33, new BigDecimal("3300.40")),
                new Employee(2,"Nick", 23, new BigDecimal("3200.40")),
                new Employee(3,"Ira", 34, new BigDecimal("4200.50")),
                new Employee(4,"Igor", 34, new BigDecimal("1890.70")),
                new Employee(5,"John", 31, new BigDecimal("3890.70"))
        };
        print(employees);
        Arrays.sort(employees);
        System.out.println("----------------------------------------");
        print(employees);

    }
    public static void print(Employee[] employees){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
