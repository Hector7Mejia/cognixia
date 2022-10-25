package sam;

@FunctionalInterface
public interface BankInter {
    public void show();

    public default void show2() {

    }
}
