package wee5.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class HashMapPeople9 {

    public static void main(String[] args) {
       HashMapPeople9 hashMapPeople9 = new HashMapPeople9();
       hashMapPeople9.map();

    }

    private void map() {

        Map<String, Integer> people = new HashMap<>();
        people.put("Aruna", 32);
        people.put("Yogesh", 33);
        people.put("Rohan", 25);


        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }
    }
}
