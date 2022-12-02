public class Main {
    public static void main(String[] args) {
        A[] array = {new X(new A()), new Y(new X(new A())), new Z(new Y(new X(new A())))};
        for (A a : array) {
            a.doIt();
            System.out.print("  ");
        }
    }
}
