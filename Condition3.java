//find the largest no. out of 3 numbers.
import java.util.Scanner;
public class Condition3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int a=sc.nextInt();
        System.out.println("Enter 2st no.");
        int b=sc.nextInt();
        System.out.println("Enter 3st no.");
        int c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("the greatest no. is "+a);
            }else{
                System.out.println("the greatest no. is "+c);
            }
        }
        else if(b>c){
            System.out.println("The greatest no. is "+b);

        }
        else{
            System.out.println("the greatest no. is "+c);
        }
        sc.close();
    }
}
