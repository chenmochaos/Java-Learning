import java.util.Scanner;

public class Progress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your last score: ");
        int lastScore = scanner.nextInt();
        System.out.print("Input your this score: ");
        int thisScore = scanner.nextInt();
        double progress = (thisScore - lastScore + 0.0) / lastScore * 100;
        System.out.printf("%.2f%%",progress);
    }
}