// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        // In java Priority Queue is implemented using min heap.
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(6);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);

        System.out.println(numbers);

        // look the min value
        System.out.println(numbers.peek());

        // remove and return the min value
        System.out.println(numbers.poll());
        System.out.println(numbers);

        // Max Heap
        PriorityQueue<Integer> max_numbers = new PriorityQueue<>(Comparator.reverseOrder());
        max_numbers.add(6);
        max_numbers.add(1);
        max_numbers.add(2);
        max_numbers.add(4);

        System.out.println(max_numbers);

        // look the min value
        System.out.println(max_numbers.peek());

        // remove and return the min value
        System.out.println(max_numbers.poll());
        System.out.println(max_numbers);

        // with comparable
        Queue<Customer> customers = new PriorityQueue<>();

        customers.add(new Customer(6, "sajid"));
        customers.add(new Customer(1, "sjd"));
        customers.add(new Customer(4, "ahmed"));

        System.out.println(customers);

        // look the min value
        System.out.println(customers.peek());

        // remove and return the min value
        System.out.println(customers.poll());
        System.out.println(customers);
        // ##########################
        // with comparator
        Queue<Customer> comparatorCustomers = new PriorityQueue<>(new CustomerOrder());

        comparatorCustomers.add(new Customer(6, "sajid", 50.0));
        comparatorCustomers.add(new Customer(1, "sjd", 100.0));
        comparatorCustomers.add(new Customer(4, "ahmed", 500.0));

        System.out.println(comparatorCustomers);

        // look the min value
        System.out.println(comparatorCustomers.peek());

        // remove and return the min value
        System.out.println(comparatorCustomers.poll());
        System.out.println(comparatorCustomers);

    }
}

class Customer implements Comparable<Customer> {
    private Integer orderId;
    private String name;
    private Double amount;

    public Customer(Integer id, String name) {
        this.orderId = id;
        this.name = name;
    }

    public Customer(Integer id, String name, Double amount) {
        this.orderId = id;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Customer{" + "orderId=" + orderId + ", amount=" + amount + ", name=" + name + "}";
    }

    @Override
    public int compareTo(Customer o) {
        return o.orderId > this.orderId ? 1 : -1;
    }

    Double getAmount() {
        return this.amount;
    }
}

class CustomerOrder implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getAmount() < o2.getAmount() ? 1 : -1;
    }
}
