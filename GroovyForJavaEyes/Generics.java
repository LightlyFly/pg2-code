import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2.0);
        list.add("hello");

        System.out.println("List populated");
        for(int element : list) { System.out.println(element); }
    }
}