package task5;

public class Cat extends Animal {

    public Cat(String name) {
        super.setName(name);
    }

    public String run(double x) {
        if (x >= 200) x = 200;
        if (x < 0) x = 0;
        return "Cat " + super.getName() + " ran " + x + "m";
    }


    public String swim(double x) {
        return "Cat " + super.getName() + " does not swims!";
    }

}
