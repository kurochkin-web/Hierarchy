package Animals;

import Services.HasFur;
import Services.Mammal;

public class Cat extends Mammal implements HasFur {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " бегает на лапках.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу!");
    }
}
