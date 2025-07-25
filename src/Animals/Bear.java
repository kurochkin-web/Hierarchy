package Animals;

import Services.HasFur;
import Services.Mammal;

public class Bear extends Mammal implements HasFur {
    public Bear(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " идёт по лесу.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " рычит.");
    }
}
