package Basic;

public class IsPrimaryStu {
    public static void main(String[] args) {
        int age = 7;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = age <= 12 && age >= 6 ? true : false;
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}
    