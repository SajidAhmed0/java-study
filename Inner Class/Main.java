// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.heyThere();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.whatsUp();

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.whatsUp();

    }

}

class OuterClass {
    int number = 6;

    public void heyThere() {
        System.out.println("Hey There!");

        // Type 03: Local inner class - not accessbile outside the method, can't add
        // public to class initialization
        class LocalInnerClass {
            String name = "Sajid";

            public void printLocalInnerClassName() {
                System.out.println("Hey " + name);
            }
        }

        LocalInnerClass lic = new LocalInnerClass();
        lic.printLocalInnerClassName();
    }

    // Type 01: Non Static inner class
    public class InnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("Whats up from inner class!");
        }
    }

    // Type 02: Static inner class
    public static class StaticInnerClass {
        int innerNumber = 8;

        public void whatsUp() {
            System.out.println("Whats up from static inner class!");
        }
    }
}
