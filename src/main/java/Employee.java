import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Employee {

    private String name;
    private int ID;
    private String address;
    private String firstName;
    private int salary;
}
