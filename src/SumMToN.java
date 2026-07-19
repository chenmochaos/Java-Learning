public class SumMToN {
    public static void main(String[] args) {
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用while计算M+...+N:
        while (m <= n) {
            sum += m;
            m++;
        }
        System.out.println(sum);

        m = 20;
        sum = 0;

        do {
            sum += m;
            m++;
        } while (m <= n);
        System.out.println(sum);
    }
}