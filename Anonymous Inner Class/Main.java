// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.makeNoise();

        // Type 01: with subclass of another class
        // cannot create new methods, only override
        // if we create new methods, it is only accessible in side that class
        Animal bigFoot = new Animal() {
            public void makeNoise() {
                System.out.println("GRALSKLDF LKF. ");
                make();
            }

            public void make() {
                System.out.println("Hello");
            }
        };

        bigFoot.makeNoise();

        // Type 02: with interface
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("runnable");
            }
        };

        runnable.run();

    }
}

class Animal {
    public void makeNoise() {
        System.out.println("yep yep yep");
    }
}