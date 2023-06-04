package wee5.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Colors4 {

    public static void main(String[] args) {
        Colors4 colors4 = new Colors4();
        colors4.colorArrayList();
    }

    private void colorArrayList() {

        List<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Pink");
        list.add("Blue");
        list.add("Red");
        list.add("Black");


        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
