package JavaNotes;

public class Student implements Comparable<Student> {           // implements Comparable brings in methods that allow you to compare multiple items.
                                                                // Implements is used for interfaces

    private String name;

    public Student (String name) {
        this.name = name;
    }
    public boolean equals (Student other) {         // Method accepting a Student data type and comparing the names together
        if (this.name == other.name) {
            return true;
        } else {

            return false;
        }
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {                  // Don't need to call this method for it to work! Jav
        return this.name;
    }
    
}
