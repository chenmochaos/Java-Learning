public class ForLoop {
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }

        int sum = 0;
        for (int n : ns) {
            sum += n;
        }
        System.out.println(sum); // 55
    }
}
