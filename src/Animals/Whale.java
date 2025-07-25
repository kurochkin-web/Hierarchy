package Animals;

import Services.LivesInWater;
import Services.Mammal;

public class Whale extends Mammal implements LivesInWater {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " плывёт через океан.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " поёт подводные песни.");
    }
}
