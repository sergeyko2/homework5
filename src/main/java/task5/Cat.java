package task5;

public class Cat extends Animal {

    // Var for calculate total cat
    static private int countCat;

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

    public static int getCountCat() {
        return countCat;
    }

    public static void setCountCat(int countCat) {
        Cat.countCat = countCat;
    }
}
