package Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        int Fn = 1;
        int fn2 = 0;
        int fn1 = 1;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        // 0 1 1 2 3 5 8 13 21 34
        if (n == 0) {
            System.out.println(0);
        } else if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 2; i < n; i++) {
                Fn = fn2 + fn1;
                fn2 = fn1;
                fn1 = Fn;
            }
        }
        System.out.println(Fn);
    }


}
