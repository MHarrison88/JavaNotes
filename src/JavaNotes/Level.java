package JavaNotes;

public enum Level {         // Defines constants. Has toString method built in so it displays the value instead of memory address unless you specifically say.
    HIGH(3),                // Need the numbers in parentheses since we have a private constructor
    MEDIUM(2),
    LOW(1);


    private int lvlNum;

    private Level(int num) {
        this.lvlNum = num;
    }

    public int getLvl () {
        return this.lvlNum;
    }
    public void setLvl (int num) {
        this.lvlNum = num;
    }

}
