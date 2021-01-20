package JavaNotes;      // To do a package in visual studio code the path is Folder/src/packageFolder/FilesOrClasses

public class Dog {

    protected static int count = 0;             // Static changes the way variables are altered. It changes the instance of "count" for EVERY object created
// Example: For this class you can set different dog names based off the parameters entered. The count variable will be the same no matter what object is used.
// This count variable will also include any subclasses.

    protected String name;                      // Private means this is ONLY available in this class
    protected int age;                          // Protected means this class, all subclasses, and other classes in this package can access it.
                                                // Protected or public is necessary when overriding methods in subclasses so they can access it. Same for methods
        
    public Dog(String name, int age) {          // Constructor method. Must be same name as file
        this.name = name;
        this.age = age;
        Dog.count += 1;                         // this.count would work as well but this is better syntax for static.
                                                // The constructor method is called for each object that is created.
        Dog.display();                          // cannot use this.display(); The method is static so it does not see the parameters.
                                                // "this" keyword is used to the instance of the objects

    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

    public int getAge() {               // Get method so the main program can access this class due to private variables. Get method has a return type but no params
        return this.age;
    }

    public void setAge(int age) {       // Set method to accept changes from main program.
        this.age = age;                 // this.age is referring to the "age" within this class. The "int age" and " = age" refers to the age in the main program
    }

    private int add2() {                // Private method can only be used and seen within this class
        return this.age + 2;            // if you wanted to call this method within this class it would simply be "add2();"
    }

    public static void display() {         // Void means you are not returning any value 
        System.out.println("I am a dog!"); // Use static methods when you don't care about the instance and you just want to DO something.
    }

}