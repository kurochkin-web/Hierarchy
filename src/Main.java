import Animals.*;
import Services.*;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик");
        Animal bear = new Bear("Миша");
        Animal whale = new Whale("Каспер");
        Animal fish = new Fish("Немо");

        cat.move(); ((HasFur)cat).describeFur();
        bear.move(); ((HasFur)bear).describeFur();
        whale.move(); ((LivesInWater)whale).describeHabitat();
        fish.move(); ((LivesInWater)fish).describeHabitat();

        if (cat instanceof HasSpine) {
            HasSpine spine = (HasSpine) cat;
            spine.describeSpine();
        }
    }
}