package Basic;

public class CalcPI {
    public static void main(String[] args) {
        double pi = 0;
        int flag = -1;
        for (int i = 1; i < 1_000_000; i += 2) {
            flag *= -1;
            pi += (1.0 / i) * flag;
        }
        System.out.println(4 * pi);
    }
}