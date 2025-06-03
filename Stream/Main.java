// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 9, 8, 7);
        
        nums.forEach(n -> System.out.println(n * 2));
        
        System.out.println(nums);
        
        // Stream
        Stream<Integer> stream_nums = nums.stream();
        
        System.out.println(stream_nums);
        // If we used stream, we cannot use it again. stream can be used once.
        // System.out.println(stream_nums.count());// if this statement run, we cannot access stream again.
        
        // stream_nums.forEach(n -> System.out.println(n));
        
        // sorting
        // Stream<Integer> sorted = stream_nums.sorted();
        // sorted.forEach(n -> System.out.println(n));
        
        // using external loop
        // for(int n : nums){
        //     System.out.println(n * 2);
        // }
        
        // Map
        // Stream<Integer> doubledStream = stream_nums.map(n -> n*2);
        // System.out.println(stream_nums);
        // doubledStream.forEach(n -> System.out.println(n));
        
        // in below we are creating 3 stream.(stream(), sorted(), map()). But when we consume first stream, it's gone, then we replace it with second. and on.
        nums.stream()
            .sorted()
            .map(n -> n * 3)
            .forEach(n -> System.out.println(n));
            
        System.out.println("With filter: ");
        nums.stream()
            .filter(n -> n % 2 != 0)
            .sorted()
            .map(n -> n * 3)
            .forEach(n -> System.out.println(n));
            
        System.out.println("using predicate for filter: ");
        // using anonymous inner class (Predicate is an abstract class)
        Predicate<Integer> predicate = new Predicate<>(){
            @Override
            public boolean test(Integer n){
                return n % 2 == 0;
            }
        };
        
        
        nums.stream()
            .filter(predicate)
            .sorted()
            .map(n -> n * 3)
            .forEach(n -> System.out.println(n));
        
        System.out.println("Total(add): ");
        // reduce
        int totalA = nums.stream()
                        .filter(n -> n % 2 != 0)
                        .sorted()
                        .map(n -> n * 3)
                        .reduce(0, (c, e) -> c + e);
                        
        System.out.println(totalA);
        
        System.out.println("Total(mul): ");
        // reduce
        int totalM = nums.stream()
                        .filter(n -> n % 2 != 0)
                        .sorted()
                        .map(n -> n * 3)
                        .reduce(1, (c, e) -> c * e);
                        
        System.out.println(totalM);
    }
}