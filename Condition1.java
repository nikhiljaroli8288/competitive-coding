//to check if the person is eligibile to vote
import java.util.Scanner;
public class Condition1 {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter your age");
int age= sc.nextInt();
if(age>=18){
    System.out.println("The person is eligibile to vote");
}
else{
    System.out.println("The person is not eligibile to vote");
}
sc.close();
}
}