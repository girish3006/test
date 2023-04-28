import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

    public void Display() {
        List<String> list = new ArrayList<String>();
        list.add("Alice");
        list.add("Smith");
        list.add("Jones");

        for (String str : list) {
            str += "50";
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.Display();

        Scanner scan = new Scanner(System.in);
        scan.nextInt()
    }
}
