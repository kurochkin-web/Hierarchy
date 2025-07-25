package Services;

public interface HasFur {
    default void describeFur() {
        System.out.println("У меня есть шерсть.");
    }
}
