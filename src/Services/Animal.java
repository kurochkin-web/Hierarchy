package Services;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void move();
    public abstract void makeSound();

}
