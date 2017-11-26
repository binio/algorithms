package business;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomas on 25/11/17.
 */
public class LCM {


    public int calculate(int a, int b)
    {
        NWP nwp = new NWP();
        return a * (b / nwp.calculate(a, b));
    }

    public int calculateSteps(int a, int b){
        return 0;
    }



    public List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
