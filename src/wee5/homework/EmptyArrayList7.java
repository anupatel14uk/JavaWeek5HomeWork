package wee5.homework;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a Java program to test if an array list is empty or not.
 */
public class EmptyArrayList7 {

    public static void main(String[] args) {
        EmptyArrayList7 emptyArrayList7 = new EmptyArrayList7();
        emptyArrayList7.arrayListEmpty();
    }

    private void arrayListEmpty() {
        List<String> list = new ArrayList<>();
        list.add("Anu");
        list.add("Neha");
        list.add("Rupal");
        list.add("Khilan");
        list.add("Navil");
        list.add("Jaydeep");
        list.add("Kamlesh");

        System.out.println(list.isEmpty());
    }
}
