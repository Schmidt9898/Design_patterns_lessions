import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ApplicationStartupUtil
{
    private final static ApplicationStartupUtil INSTANCE = new ApplicationStartupUtil();

    public static ApplicationStartupUtil getInstance()
    {
        return INSTANCE;
    }

    public boolean checkExternalServices() throws Exception
    {
        return false;
    }

    public static void main(String[] args)
    {
        boolean result = false;
        try {
            result = ApplicationStartupUtil.getInstance().checkExternalServices();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("External services validation completed !! Result was :: "+ result);
    }
}