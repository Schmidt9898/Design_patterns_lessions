public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
		Widget component = new BorderDecorator(new SrollDecorator(new TextView()));
		component.draw();

    }
}
