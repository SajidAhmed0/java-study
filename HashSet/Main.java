// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.LinkedHashSet;

class Main {
    public static void main(String[] args) {
        // Not ordered
        Set<String> names = new HashSet<>();
        
        names.add("Sajid");
        names.add("sajid");
        names.add("Sajidss");
        
        names.remove("sajid");
        
        System.out.println(names.size());
        
        System.out.println(names.contains("Sajid"));
        
        System.out.println(names);
        
        for(String name : names){
            System.out.println(name);
        }
        
        names.forEach(name -> System.out.println(name));
        
        names.forEach(System.out::println);
        
        Iterator<String> namesIterator = names.iterator();
        
        while(namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        
        names.clear();
        
        System.out.println(names);
        
        List<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        
        // Set<Integer> numbersSet = new HashSet<>();
        // numbersSet.addAll(numbers);
        
        Set<Integer> numbersSet = new HashSet<>(numbers);
        
        System.out.println(numbersSet);
        
        System.out.println(numbers);
        
        // Ordered basen on natural order
        // all the methods are availabe like hashset
        // hashset is very fast compared to treeset
        Set<String> setTree = new TreeSet<>();
        setTree.add("z");
        setTree.add("y");
        setTree.add("x");
        
        System.out.println(setTree);
        
        // Does not maintain natural order of items
        // Does maintain insertion order
        // speed: hashset > linkedhashset > treeset
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("z");
        linkedHashSet.add("y");
        linkedHashSet.add("x");
        
        System.out.println(linkedHashSet);
    }
}