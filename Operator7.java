import java.util.Scanner;
public class Operator7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Bitwise AND = " + (a & b));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("b >> 1 = " + (b >> 1));

        sc.close();
    }
}