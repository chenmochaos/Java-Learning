import java.util.Scanner;

public class CalcBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Input your height: ");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.println("Too low~");
        } else if (BMI <= 25) {
            System.out.println("It's OK!");
        } else if (BMI <= 28) {
            System.out.println("A little fat~");
        } else if (BMI <= 32) {
            System.out.println("Too fat!");
        } else {
            System.out.println("OMG!");
        }
    }
}
