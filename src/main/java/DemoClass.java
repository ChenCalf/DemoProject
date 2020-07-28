import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DemoClass {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(map);
        System.out.println("aaas");
        System.out.println("哈哈哈");

    }

    protected void eat() throws Throwable {
        System.out.println("chichichi");
        System.out.println("xixixi");
    }
}
