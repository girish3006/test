import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsTest {

    public static void main(String[] args) {

        int[] a = {14,54,1,5,32};

        Employee emp1 = new Employee("Girish", 12, "asdasd", "Kumar", 1000);
        Employee emp2 = new Employee("Harish", 13, "asdasd", "Kumar", 20000);
        Employee emp3 = new Employee("Marish", 15, "asdasd", "Kumar", 2300);
        Employee emp4 = new Employee("Manish", 14, "asdasd", "Kumar", 5000);
        Employee emp5 = new Employee("Ali", 20, "asdasd", "Kumar", 6000);
        Employee emp6 = new Employee("Suji", 32, "asdasd", "Kumar", 12000);
        Employee emp7 = new Employee("Harsha", 21, "asdasd", "Kumar", 3000);

        Employee[] emplArray = {emp1, emp2, emp3, emp4, emp5, emp6, emp7};

        List<Employee> employeeList = Arrays.asList(emplArray);

        Map<Integer, Employee> map = employeeList.stream().collect(Collectors.toMap(e -> e.getID(), e -> e));

//        employeeList.stream().sorted(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getSalary()>o2.getSalary() ? 0:-1;
//            }
//        }).forEach(e -> System.out.println(e.toString()));

        employeeList.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getID()>o2.getID()?0:-1;
            }
        }).forEach(e-> System.out.println(e.toString()));
//        IntStream list = Arrays.stream(a);

//        list.sorted().forEach( i -> System.out.println(i));

//        list.filter(i -> i>5).limit(2).forEach(i -> System.out.println(i));

//        System.out.println(list.reduce(Integer::sum).getAsInt());
//        System.out.println(list.max().getAsInt());
//        System.out.println(list.min().getAsInt());

//        System.out.println(map.get(12).toString());
    }
}
