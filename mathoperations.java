public class MathOperations {
    // 1. Arthematic Operators
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println("sum : "+ (a+b));
        System.out.println("subtraction : "+ (a-b));
        System.out.println("multiplication :" + (a*b));
        System.out.println("divide : " + (a/b));
        System.out.println("remainder : " +(a%b));
        // 2. Unary Operators 
        System.out.println("Unary Operators:");
        System.out.println(++a);
        System.out.println(++a);
        // 3. Assignment Operators
        int c= 20;
    c +=10;
     System.out.println("value of c is " + c);
     c -=5;
     System.out.println("value of c is " + c);
     // 4. Relational operators
     System.out.println("Relational Operators:");
     System.out.println("a > b : " + (a  > b));
     System.out.println("a < b : " + (a < b));
     System.out.println("a == b: " + (a == b));
     System.out.println("a != b: " + (a != b));
     System.out.println("a >= b: " + (a >= b));
     System.out.println("a <= b: " + (a <= b));
     //  5. Logical Operators 
     System.out.println("Logical Operators:");
     boolean conditiona = true;
     boolean conditionb = false;
     System.out.println("conditiona && conditionb : " + (conditiona && conditionb));
     System.out.println("conditiona || conditionb : " + (conditiona || conditionb));
     System.out.println("!conditiona : " + (!conditionb));
     // 6. Ternary operators
     System.out.println("Ternary operators:");
     int max = (a>b) ? a : b;
     System.out.println("Maximum value is: " + max);
    }
}