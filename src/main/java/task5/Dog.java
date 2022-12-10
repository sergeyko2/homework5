package task5;

public class Dog extends Animal {


    public String run(double x) {
        if (x >= 500) x = 500;
        if (x < 0) x = 0;
        return "Dog " + super.getName() + " ran " + x + "m";
    }


    public String swim(double x) {
        if (x >= 10) x = 10;
        if (x < 0) x = 0;
        return "Dog " + super.getName() + " swims " + x + "m";
    }
}
