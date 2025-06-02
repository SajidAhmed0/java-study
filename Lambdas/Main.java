// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Lambdas can ONLY be used in the context on FUNCTIONAL INTERFACE.
class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.print();

        printThing(cat);

        printThing(
                () -> {
                    System.out.println("Lamda");
                });

        printThing(() -> System.out.println("Lamda Simplified"));

        Printable lambdaPrintable = () -> System.out.println("variable lambda");

        printThing(lambdaPrintable);

        Writable lambdaWritable = s -> {
            System.out.println("Hi " + s);
            return "ss";
        };

        Writable lambdaWritable2 = s -> "Hi " + s;

        writeThing(lambdaWritable);
        writeThing(lambdaWritable2);

    }

    static void printThing(Printable thing) {
        thing.print();
    }

    static void writeThing(Writable thing) {
        thing.print("!");
    }

}

class Cat implements Printable {
    public void print() {
        System.out.println("Meow");
    }
}

// If an interface has exactly ONE abstract method it called Functional
// Interface(SAM(Single Abstract Method) interface).
// if it is functional interface we can add @FunctionalInterface
@FunctionalInterface
interface Printable {
    void print();
}

@FunctionalInterface
interface Writable {
    String print(String suffix);
}
