// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.LinkedList;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // inserting and removing an item is very fast.
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("sajid");
        linkedList.add("sjd");
        linkedList.add("ahmed");
        linkedList.add("foo");

        System.out.println(linkedList.get(2));// O(n)

        linkedList.add(1, "second");

        System.out.println(linkedList);

        // in array list getting an item is very fast.
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("sajid");
        arrayList.add("sjd");
        arrayList.add("ahmed");
        arrayList.add("foo");

        System.out.println(arrayList.get(2));// O(1)

        System.out.println(arrayList);
    }
}