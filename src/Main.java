import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Object> test = new ConcurrentHashMap<String, Object>();
        HashMap<String, Object> test1 = new HashMap<String, Object>();
        String str = null;
        test1.put("test",str);
        test.put("test",str);

        System.out.println("Hello World!");
    }
}
