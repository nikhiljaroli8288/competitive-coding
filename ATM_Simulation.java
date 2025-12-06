import java.util.Scanner;
public class ATM_Simulation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ATM");
        int balance =0;
        while(true){
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        System.out.println("Enter your choise");
        int n=sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Your Balance: "+balance);
                System.out.println("");
                break;

            case 2:
                System.out.println("Enter Money to deposit: ");
                int increment=sc.nextInt();
                balance= balance+increment;
                System.out.println("New Balance: "+balance);
                System.out.println("");
                break;

                case 3:
                    System.out.println("Enter Money to withdraw: ");
                int decrement=sc.nextInt();
                if(decrement > balance){
                    System.out.println("Insufficient Balace");
                    System.out.println("");
                    break;
                }
                balance= balance-decrement;
                System.out.println("Your Current Balance: "+balance);
                System.out.println("");
                break;

                case 4:
                    System.out.println("Thank you visit again");
                    System.exit(0);
                    System.out.println("");
                    break;

                default:
                    System.out.println("The choise entered is incorrect");
                    System.out.println("");
                }
            }
    }
}
