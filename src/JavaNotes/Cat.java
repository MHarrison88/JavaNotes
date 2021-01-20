package JavaNotes;

// INHERITANCE
public class Cat extends Dog{                       // The Cat class uses the Dog class as a base. All methods in the Dog class can be used and overwritten
                                                    // Cat is a "subclass" aka derived or child class. Dog is a "superclass" aka parent
    private int food;
        
    public Cat(String name, int age, int food) {    // You still need a constructor for the class even if you inherit. You may add other params but cannot remove them
        super(name, age);                           // This calls the superclass (Dog aka the parent class) constructor
        this.food = food;
    } 

    public Cat (String name, int age) {             // 2nd Constructor in case you do not want an object that requires one of the other params
        super(name, age);
        this.food = 50;
    }
    public Cat (String name) {
        super(name, 0);                             // In place of age a default value is entered in case the user does not want to enter one
    }

    public void speak() {
        System.out.println("Meow my name is " + this.name + " and I get fed " + this.food);
    }

    public void eat(int x) {                        // This method created in the Cat class cannot be used in the Dog class
        this.food -= x;
    }
    
}
