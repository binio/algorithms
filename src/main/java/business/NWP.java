package business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NWP {

    public int calculate(int p, int q) {
        if (q == 0) {
            return p;
        }
        return calculate(q, p % q);
    }

    public int calculateSteps(int p, int q) {
        if(q==0){
            return p;
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(p);
        list.add(q);

        Collections.sort(list, Collections.reverseOrder());

        if(list.get(0)-list.get(1) > 0) {
            System.out.println(list.get(0)-list.get(1)+",");
            return calculateSteps(list.get(1),list.get(0)-list.get(1));
        }
            return list.get(1);

    }
}
