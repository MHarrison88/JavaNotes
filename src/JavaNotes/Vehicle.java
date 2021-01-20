package JavaNotes;

public interface Vehicle {          // Never create an instance of an interface. Can only have public methods and we don't define attributes
    final int gears = 5;             // All variables have to be "Final". Final means we cannot change them

    void speedUp(int a);            // Does not do anything. just defines that this method exists.
    void slowDown(int a);
    void changeGear(int a);

    default void out() {            // Default method that you can use in other classes
        System.out.println("Default method");
    }

    static int math(int b) {
        return b + 9;
    }
}