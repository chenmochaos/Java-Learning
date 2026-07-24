package Basic;

public class AverageOfStudent {
    public static void main(String[] args) {
        int[][] scores = {
                {82, 90, 91}, // 学生甲的语数英成绩
                {68, 72, 64}, // 学生乙的语数英成绩
                {95, 91, 89}, // ...
                {67, 52, 60},
                {79, 81, 85},
        };

        double average = 0;
        int sum = 0;
        int scoreNum = 0;
        for (int[] arr : scores) {
            for (int n : arr) {
                sum += n;
            }
            scoreNum += arr.length;
        }
        average = sum * 1.0 / scoreNum;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
