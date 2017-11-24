package business;

public class NWP {
    int nwp;
    int a;
    int b;

    public NWP(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public static int calculate(int p, int q) {
        if (q == 0) {
            return p;
        }
        return calculate(q, p % q);
    }
}
