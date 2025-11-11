import java.util.function.*;

class Employee{
    String ename;
    int salary;
    int experience;

    public Employee(String name, int sal, int exp){
        this.ename = name;
        this.salary = sal;
        this.experience = exp;
    }
}

public class object_in_preficate {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vicky", 32000, 5);

        Predicate<Employee> person = (e) -> (e.salary > 30000 && e.experience > 3);
        System.out.println(person.test(e1));


        Employee[] emp = {new Employee("Smith", 2, 4), new Employee("Satyam", 50000, 5), new Employee("Vicky", 32000, 5), new Employee("Vivek", 67000, 6)};

        for(Employee e : emp){
            if(person.test(e)){
                System.out.println(e.ename);
                System.out.println(e.salary);
                System.out.println(e.experience);
            }
        }
    }
}
