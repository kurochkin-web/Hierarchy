package Services;

public interface LivesInWater {
    default void describeHabitat() {
        System.out.println("Я живу в воде.");
    }
}
