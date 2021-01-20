package JavaNotes;

public class OuterClass {

    public class InnerClass {
        public void display() {
            System.out.println("This is an inner class");
        }
    }



    public void inner() {       // Creates an instance of the inner class within the outer class so that we can use it in the main program if the inner class is private
        class InnerClass2 {     // can't add private or public on this class because it is already in a void method.
            public void display2() {
                System.out.println("Inner class 2");
            }
        }
        InnerClass in = new InnerClass();
        InnerClass2 in2 = new InnerClass2();
        in.display();
        in2.display2();
    }
}
