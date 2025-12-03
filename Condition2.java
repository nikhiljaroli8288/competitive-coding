//to check a no. is positive,negative or zero
import java.util.Scanner;
public class Condition2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        if(n>0){
            System.out.println("Entered number is positive");
        }
        else if (n<0) {
            System.out.println("Entered number is negative");
        }
        else{
            System.out.println("Entered number is zero");
        }
sc.close();
    }
}
