// check if the no. is multiple of 3
import java.util.Scanner;

public class Condition6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n % 3 == 0)
            System.out.println("Multiple of 3");
        else
            System.out.println("Not a multiple");
    }
}
