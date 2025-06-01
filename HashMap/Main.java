// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> empDetails = new HashMap<>();

        empDetails.put(1, "sajid");
        empDetails.put(2, "sjd");
        empDetails.put(3, "ahmed");

        empDetails.replace(2, "elephant");

        System.out.println(empDetails);

        System.out.println(empDetails.get(2));
        System.out.println(empDetails.get(5));

        System.out.println(empDetails.values());

        System.out.println(empDetails.size());

        System.out.println(empDetails.keySet());

        System.out.println(empDetails.containsKey(2));
        System.out.println(empDetails.containsKey(5));

        empDetails.put(2, "e-ee");
        // replace will not do anything if key does not exists.
        // put will update if key exists, put will put new entry if key does not exists.
        System.out.println(empDetails.containsValue("ahmed"));

        empDetails.putIfAbsent(4, "saji");

        empDetails.remove(1);

        System.out.println(empDetails);

    }

}