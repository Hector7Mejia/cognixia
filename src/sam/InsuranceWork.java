package sam;

public class InsuranceWork {

    public static void show(InsuranceInter demo) {
        demo.show();
    }

    public static void main(String[] args) {
        show(() -> System.out.println("Yo"));

    }


}
