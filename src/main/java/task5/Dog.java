package task5;

public class Dog extends Animal {

    public Dog(String name) {
        super.setName(name);
    }

    public String run(double x) {
        String only = "";
        if (x >= 500) {
            x = 500;
            only = " only";
        }
        if (x < 0) x = 0;
        return "Dog " + super.getName() + only + " ran " + x + "m";
    }

    public String swim(double x) {
        String only = "";
        if (x >= 10) {
            x = 10;
            only = " only";
        }
        if (x < 0) x = 0;
        return "Dog " + super.getName() + only + " swims " + x + "m";
    }
}
