public class CharacterTest {

    public static void main(String[] args) {

        String c = "ABCDEFDIVGHIJKLMNICPCOPQRSTUVWXYZO";

        char[] list = c.toCharArray();

        for(int i=0;i<list.length;i++){
            int a = list[i];
            System.out.println(a);
        }
    }
}
