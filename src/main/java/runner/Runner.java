package runner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {

        method(0);
        String value = "red";
        switch(value) {
            case "red":
                System.out.println("FAIL");
                break;
            case "green":
                System.out.println("OK");
                break;
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("d",3);
        map.put("c",4);
        map.put("aa",5);

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }

    }

    public static void method(int a) {
        a = 4;
        System.out.println(a);
    }
}
