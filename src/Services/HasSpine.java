package Services;

public interface HasSpine {
    default void describeSpine() {
        System.out.println("У меня есть позвоночник.");
    }
}
