package Animals;

import Services.Animal;
import Services.LivesInWater;

public class Fish extends Animal implements LivesInWater {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " плывёт в аквариуме.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " молчит (у рыб нет голоса).");
    }
}
