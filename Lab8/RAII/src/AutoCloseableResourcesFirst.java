import java.io.IOException;

public class AutoCloseableResourcesFirst implements AutoCloseable {

    public AutoCloseableResourcesFirst() {
        System.out.println("Constructor -> AutoCloseableResources_First");
    }

    public void doSomething() {
        System.out.println("Something -> AutoCloseableResources_First");
		throw new Exception("asd");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResources_First");
    }
}