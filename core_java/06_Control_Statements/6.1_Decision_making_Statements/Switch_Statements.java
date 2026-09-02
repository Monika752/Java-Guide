import java.util.Scanner;
public class Switch_Statements {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("---------------- Mini Banking System ------------------");
        double initial_balance = 10000;
        int initial_pin = 1234;
        System.out.println("1. Check Balance \n 2. Deposit Money \n 3. Withdraw Money \n 4. Change PIN \n 5. Exit");
        System.out.println("Enter choice :");
        int choice = sc.nextInt();
        switch(choice){
            case 1 : System.out.println("Current Balance : Rs." + initial_balance);
                     break;
            case 2 : System.out.println("Enter deposit amount :");
                     double amt = sc.nextDouble();
                     initial_balance = initial_balance + amt;
                     System.out.println("Deposited Amount : " + amt);
                     System.out.println("Updated Amount : " + initial_balance);
                     break;
            case 3 : System.out.println("Enter withdrawal Amount :");
                     double withdraw_amt = sc.nextDouble();
                     if(withdraw_amt < initial_balance){
                        initial_balance = initial_balance - withdraw_amt;
                        System.out.println("withdrawn Amount : " + withdraw_amt);
                        System.out.println("Account Balance : " + initial_balance);
                     }
                     else{
                        System.out.println("Insufficient Balance");
                     }
                     break;
            case 4 : System.out.println("Enter your current Pin :");
                     int pin_no = sc.nextInt();
                     if(pin_no == initial_pin){
                        System.out.println("Enter new Pin :");
                        int new_pin = sc.nextInt();
                        initial_pin = new_pin;
                        System.out.println("PIN number changed successfully !");
                     }
                     else{
                        System.out.println("Pin is incorrect !");
                     }
                     break;
            case 5 : System.out.println("Thank you for using our banking service.");
                     break;
            default : System.out.println("Invalid Choice ..");
        }
        sc.close();
    }
}
