package task5;

public class Cat extends Animal {

    public Cat(String name) {
        super.setName(name);
    }

    public String run(double x) {
        String only = "";
        if (x >= 200) {
            x = 200;
            only = " only";
        }
        if (x < 0) x = 0;
        return "Cat " + super.getName() + only + " ran " + x + "m";
    }

    public String swim(double x) {
        return "Cat " + super.getName() + " does not swims!";
    }
}
