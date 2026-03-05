import java.util.Scanner;
public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numeric grade: ");
        int grade = sc.nextInt();
        String message =  (grade >= 40) ?
        "pass" : "Fail";
        System.out.println(message);
        sc.close();
            }
}