import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computer = 1 + random.nextInt(3);

        System.out.print("Input your choice(Rock -> 1, Scissors -> 2, Paper -> 3): ");
        int user = scanner.nextInt();
        if (computer == user) {
            System.out.println("平局");
        } else {
            String result = switch (user) {
                case 1 -> computer == 3 ? "You Lost!" : "Your Win!";~
                case 2 -> computer == 1 ? "You Lost!" : "Your Win!";
                case 3 -> computer == 2 ? "You Lost!" : "Your Win!";
                default -> "Please input the valid number!";
            };
            System.out.println(result);
        }
    }
}
