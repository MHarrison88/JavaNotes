package JavaNotes;

public class Car implements Vehicle {
    private int gear = 1;
    private int speed = 0;

    public void speedUp(int change) {
        this.speed += change;
    }

    public void slowDown(int change) {
        this.speed -= change;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void display() {
        System.out.println("I am a car going " + this.speed + " and I am in gear " + this.gear);
        out();
    }
}
