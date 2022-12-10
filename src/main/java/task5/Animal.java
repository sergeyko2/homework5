package task5;

public abstract class Animal {

    private String name;

    public abstract String run(double x);
    public abstract String swim(double x);

// getter-setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
