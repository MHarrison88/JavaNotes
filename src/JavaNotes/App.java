package JavaNotes;      // To do a package in visual studio code the path is Folder/src/packageFolder/FilesOrClasses

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import javax.lang.model.element.Element;

public class App {
	public static void main(String[] args) throws Exception {
                System.out.println("INTRO AND PRIMITIVE DATA TYPES LINE 19\n\n");
                System.out.println("Hello World!");                                     // Display text and that's it
		
	         //Primitive data types
	        int helloWorld = 5;
	        double num2 = 5;
                boolean b = true;
                char c = 'h';
		
	        //Not primitive data type
	        String str = "Tim";
	
                System.out.println(helloWorld);

                System.out.println("TYPE CASTING LINE 33\n\n");
		
                int x = 5;
                int y = 2;
                int z = 3;

                //example of type casting
                double u = 4;
                u = (double)y * z;                                                  // Normally y is an int but the (double) changes its type.
                System.out.println(Math.pow(x, y));
                int percent = 12 % 3;                                              // The modulus operator (%) gives the remainder after a division.
                                                                                // it would be 4 in this case

        System.out.println("INPUT/SCANNER SECTION LINE 46\n\n");
        // SCANNER SECTION
                Scanner sc = new Scanner(System.in);
                /*String scanned = sc.next();       delete this comment if you want this to work!*/
                                                                                // Scanner is a string! cannot use .next with int data type. There are others for that.
                // int scanned = sc.nextint(); There are also methods for Booleans, double, flaots etc.

                /* System.out.println(scanned);      delete the comment marks if you want this to work!*/

                // int xx = Integer.parseInt(scanned) Generally scanner should accept a string and change the data type to whatever you need afterwards.


        System.out.println("COMPARISON LINE 58\n\n");
                int xx = 6;
                int yy = 7;
                int zz = 10;
                // > < == >= <= !=
                // = and == are different. = is an assignment operator and == is a comparison operator
                boolean compare = xx < yy;
                System.out.println(compare);

                String aa = "Boop";
                String bb = "Blob";
                String cc = "Blork";
                // > < == >= <= !=
                // = and == are different. = is an assignment operator and == is a comparison operator
                boolean compare2 = aa == bb && bb != cc;                             // Can only use == or != when comparing strings. Better option is doing something
                                                                                 // like aa.equals("words");  you can put a variable in there as well.
                                                                                 // && is AND operator and || is OR allowing for multiple conditions
                // Could also do boolean compare !(x < y);   the ! is for "not"
                System.out.println(compare2);

        System.out.println("IF STATEMENTS LINE 78\n\n");
        // IF STATEMENTS
                Scanner sc2 = new Scanner(System.in);
                /*String s  = sc2.nextLine();

                if (s.equals("mike")) {
                        System.out.println("You typed mike");
                } else if(s.equals("hello")) {
                        System.out.println("hi");
                } else {
                        System.out.println("You did not type mike");
                }*/

        // NESTED STATEMENTS

                
               /* String l = sc2.nextLine();
                int age = Integer.parseInt(l);

                if (age >= 18) {
                        System.out.print("Enter your favorite food: ");
                        String food = sc2.nextLine();
                        if (food.equals("pizza")) {
                                System.out.println("Mine too!");
                        } else {
                                System.out.println("Not mine...");
                        }
                } else if (age >=13) {
                        System.out.println("You are a teenager");
                } else {
                        System.out.println("You are not a teenager or an adult");
                }    */ 
                
        System.out.println("ARRAYS LINE 111\n\n");
        // Arrays
                String[] newArr = new String[5];              // Cannot change amount of indices in array. Sets all values to null until something is entered
                //Could also create the array like so String[] newArr = {"Hello", "Bill", "Frank", "Time", "Steve"};
                newArr[0] = "Hello";
                newArr[1] = "Bill";
                newArr[2] = "Frank";
                newArr[3] = "Tim";
                newArr[4] = "Steve";
                String g = newArr[1];
                System.out.println(g);

                int[] arr = {3, 5, 3, 4, 5, 7, 23, 6, 9, 45};


        System.out.println("FOR LOOP LINE 124\n\n");
        // For loop
                for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == 5) {
                                System.out.println("Found a 5 at index " + i);
                        }
                }

                int[] arr2 = {1, 5, 7, 4, 23};
                String[] names2 = new String[5];

                int count = 0;

                for (int element:arr) {                                                // Iterates over each element in the array
                        System.out.println(element + " " + count);
                        count++;
                }
                /* For Each Loop. It starts with the keyword for like a normal for-loop.
                Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array (int element),
                followed by a colon, which is then followed by the array name (arr).
                In the loop body, you can use the loop variable you created rather than using an indexed array element.
                It’s commonly used to iterate over an array or a Collections class (eg, ArrayList)*/

               /* Scanner sc3 = new Scanner(System.in);
                for (int i = 0; i < names2.length; i++) {                               // Another way to iterate over the array
                        System.out.print("Input: ");
                        String input = sc3.nextLine();
                        names2[i] = input;
                }

                for (String n : names2) {
                        System.out.println(n);
                        if (n.equals("tim")) {
                                break;                                                  // Breaks out of the loop if the name tim is entered.
                        }
                }*/



        System.out.println("WHILE LOOP LINE 163\n\n");
        // While loops                                  Can do anything with a while loop that you can with a for loop. 
                                                        // For loops are more for if you know how many times to iterate

                
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Type 10...");
                int q = sc4.nextInt();
                
                int count2 = 1;

                while (q != 10) {
                        count2++;
                        System.out.println("Type 10...");
                        q = sc4.nextInt();
                }


                /*int q = 0;                                                    //Do-while version of the same loop. Do while executes some code first before looping
                do {
                        count2++;
                        System.out.println("Type 10...");
                        q = sc4.nextInt();                        
                } while (q != 10);*/

                 System.out.println("You tried " + count2 + " times!");


        System.out.println("SETS AND LISTS LINE 192\n\n");
        //Sets and Lists

                // Comparing to arrays, you do not need to know how many elements are in
                Set<Integer> t = new HashSet<Integer>();        // Need import set and import hashset!!!!
                                                                // A set cannot contain the same element twice and it does not know where the element is.
                t.add(5);
                t.add(7);
                t.add(5);                                       // This entry is not added since their cannot be duplicates.
                t.add(-8);
                t.add(9);
                // t.remove(o)                                  Removes an element from a HashSet

                System.out.println(t);                          // Does not necessarily print in same order added

                boolean w = t.contains(5);                      // Sets are insanely fast when searching if an item exists
                System.out.println(w);
                //t.clear();                                       Clears the entire set
                //t.isEmpty();                                     Checks if a set is empty
                t.size();                                       // Checks the size of the set
                System.out.println(t.size());

                Set<Integer> o = new LinkedHashSet<Integer>();        // Need import set and import LinkedHashSet!!!! Similar to HashSet. Faster on certain operations.

                ArrayList<Integer> p = new ArrayList<Integer>();        // Similar to array. Slightly slower but can change sizes after creation. Need an import to.
                                                                        // Important to use Integer instead of int. same as String vs str
                                                                        // Nearly identical properties as a hash set. Can use indices though, like an array.
                p.add(1);
                System.out.println(p.get(0));
                p.set(0, 5);                                            // Sets an index in format u.set(index, element);. This is only to CHANGE an existing index.
                System.out.println(p.get(0));
                // p.subList(fromIndex, toIndex)                        // Gets a range of indices specified
                // LinkedList<Integer> p = new LinkedList()<Integer>();    Similar to list. Faster on certain on certain operations.

        /* Final comments on lists and sets: If you are unsure on the length of list/array, use Arraylist to add as many items at any time. Use a set if you don't care
         how many times or where something exists, just IF it exists. A set can be better because it is simpler and a lot faster to do operations on in terms of efficiency*/


        System.out.println("MAPS AND HASH MAPS LINE 231\n\n");
         // Maps and HashMaps
                                                                        // maps are like Dictionaries in Python. A Map is known as a key value pair.
                                                                        // AKA Dictionaries, hash tables, hash maps
                Map s = new HashMap();                                  // Like array and List. Instead of indexing by numbers you index by keys. Keys can be any data type.
                s.put("Tim",5);                                         // s.put(key, value); Key is used to access the value later
                s.put(99, 10);
                System.out.println(s);
                System.out.println(s.get("Tim"));                       // s.get("key"); This displays the value associated with the key
                                                                        // If key does not exist it returns null
                                                                        // Can't contain duplicate keys. Can contain duplicate values. No guarenteed order, just ordered how added?

                Map d = new TreeMap();                                  // Treemaps contain a sorted order (Alphabetical?). 
                                                                        // Must use same data type for all keys. Values can be any data type.
                s.containsValue(5);                                     // Checks if the map contains the value. Returns a Boolean
                s.containsKey(99);                                      // Same as above but checks for key
                // s.values();                                             Prints out all values
                // s.clear();                                              Clears the entire set
                // s.isEmpty();                                            Checks if a set is empty
                // s.remove();                                             removes a key
               
                        //Example of an Array being stored into an existing map with each array value being assigned a key through a counter.
                Integer[] blank = {33, 45, 78, 11111, 003};
                int blankCount = 0;
                for (Integer element2 : blank) {
                        s.put(blankCount, blank[blankCount]);
                        blankCount++;
                }
                System.out.println(s);
/* Counts how many times a letter appears in a string
                String str2 = "hello my name is mike and i am cool";
                int counter = 0;

                for (char ele : str2.toCharArray()) {
                        if (ele == 'm') {
                                counter++;
                        }
                }
                System.out.println(counter);
*/

/* Counts how many times each letter is in the string sentence. It creates a key using the found letter while
 the value is how many times the number is counted through the loop
                Map f = new HashMap();
                String str3 = "hello my name is mike and i like cats";

                for (char ele2  : str3.toCharArray()) {
                        if (f.containsKey(ele2)) {
                                int old = (int) f.get(ele2);
                                f.put(ele2, old+1);
                        } else {
                                f.put (ele2, 1);
                        }
                }
                System.out.println(f);
*/

                int[] sortArray = {5, -3, 55, 7, 4, 2, 7};
                Arrays.sort(sortArray, 0, 5);                           // Arrays.sort(arrayName, starting index, ending index)
                                                                        // Sorts the array. The 2nd and 3rd argument are optional if you don't want the entire thing sorted
                                                                        // The ending index actually stops right before the index number specified.

                for (int i : sortArray) {
                        System.out.print(i + ", ");;
                }

                System.out.println("");


        System.out.println("CLASSES AND METHODS USING DOG FILE LINE 300\n\n");
        //Classes and methods           USE DOG/CAT CLASSES IN DIFFERENT FILE!!!
                tim();
                name("Beep Boop");                                      // the string in parentheses passes to the method
                System.out.println(add2(5));

                Dog fido = new Dog("fido", 10);                         // Creates an object from the other class file (Dog.java). Add params when making object
                                                                        // ClassName variableName = new ClassName(params for constructor);
                fido.speak();                                           // Uses the method that was made in the Dog class using the class object. fido, that was made above
                Dog bones = new Dog("bones", 3);                        // Can make multiple objects using the same class blueprint. Can use different parameters
                bones.speak();
                Dog brutus = new Dog("brutus", 6);
                brutus.speak();


                System.out.println(fido.getAge());
                fido.setAge(12);
                System.out.println(fido.getAge());

                // fido.add2();                                            This method cannot be used because add2() is a private method in the dog class


                
        System.out.println("SUBCLASSES AND INHERITANCE USING DOG AND CAT FILES LINE 321\n\n");
        // Subclass and inheritance
                Cat Baby = new Cat("Baby", 10, 5);                       // Example of different constructors
                Baby.speak();
                Cat smokey = new Cat ("smokey", 1);
                smokey.speak();
                Cat lilKitty = new Cat("Little Kitty");
                lilKitty.speak();



        System.out.println("STATIC VARIABLES USING DOG FILE LINE 330\n\n");
        // Static variables
                Dog fred = new Dog("fred", 7);
                Dog steve = new Dog("steve", 12);
                Dog glomp = new Dog("glomp", 18);
                System.out.println(Dog.count);
                Dog.count = 33;
                System.out.println(glomp.count);



        System.out.println("OVERLOADING METHODS AND OBJECT COMPARISONS USING STUDENT FILE LINE 343\n\n");
        // Overloading methods and object comparisons

                Student joe = new Student("Joe");
                Student bill = new Student("Bill");
                Student tim = new Student("tim");

                System.out.println(joe == bill);        // Compares the actual object so returns false even if you set the names the same.
                System.out.println(joe.equals(bill));
                System.out.println(joe.compareTo(bill));
                System.out.println(joe.compareTo(bill) > 0); // Will return true if joe is greater than bill and false if not.
                // Unsure exactly what the above statement checks for greater or less than. Maybe how far first letter us away from eachother?

                System.out.println(joe);        // Without the toString method in the Student class, this would return the memory address
                // Since we are using the toString method Java automatically displays the name without even having to call joe.toString();


        System.out.println("INNER AND OUTER CLASSES USING OUTERCLASS FILE LINE 360\n\n");
        // Inner and Outer classes
                OuterClass out = new OuterClass();
                // out.inner();                            Need to do it this way if the inner class is private

                OuterClass.InnerClass in = out.new InnerClass();
        //Above statement calls the InnerClass data type from within the outer class and makes the "in" object. out.new is a diff way of doing it for inner classes?
                in.display();

                out.inner();



        System.out.println("INTERFACES USING VEHICLE AND CAR JAVA FILES LINE 371\n\n");
        // Interfaces
                Car mazda = new Car();
                mazda.speedUp(10);
                mazda.changeGear(3);
                mazda.display();

                System.out.println(Vehicle.math(3));                // Can pull from the interface directly.


        System.out.println("ENUMS IN LEVEL.JAVA FILE LINE 381\n\n");
        // ENUMS
                Level lvl = Level.LOW;

                if (lvl == Level.LOW) {
                        System.out.println(lvl);
                } else if (lvl == Level.MEDIUM) {
                        System.out.println(lvl);
                } else {
                        System.out.println(lvl);
                }

                // System.out.println(Level.values());                  Returns the memory address in an array format

                for (Level e : lvl.values()) {                          // Iterates over the memory value, stores what it could be in e, then displays each potential value
                        System.out.println(e);
                }

                System.out.println(lvl.getLvl());

                System.out.println(Level.valueOf("LOW"));

                lvl.setLvl(3);
                System.out.println(lvl.getLvl());
                System.out.println(lvl);




        }


        // Classes
        public static void tim() {
                System.out.println("Tim!");
        }

        public static void name(String strName) {                       // Parameter that uses a variable as the name. Can do multiple params
                System.out.println(strName);
        }

        public static int add2(int x) {                                 // Performs an addition operation and returns the value
                return x + 2;
        }
}