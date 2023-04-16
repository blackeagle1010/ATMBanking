import java.util.Scanner;

public class ATMBank {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int balance = 2000, deposit, withdraw, passright = 3;
        String username, password;
        int option;
        while (passright > 0) {
            System.out.println("enter your username:");
            username = Input.nextLine();
            System.out.println("enter your password:");
            password = Input.nextLine();
            if (username.equals("Mehmet") && password.equals("Bjk123")) {
                System.out.println("your authentication is successfull...");
                do {
                    System.out.println("1:balance\n" +
                            "2:deposit\n" +
                            "3:withdraw\n" +
                            "4:quit");
                    System.out.println("choose the one of below options:");
                    option = Input.nextInt();

                    switch (option) {
                        case (1):
                            System.out.println("your balance is:" + balance);
                            break;
                        case (2):
                            System.out.println("enter your value for deposit:");
                            deposit = Input.nextInt();
                            balance += deposit;
                            System.out.println("your deposited value is:" + balance);
                            break;
                        case (3):
                            System.out.println("enter your value for withdraw:");
                            withdraw = Input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("your balance is insufficent to witdraw");
                            }else {
                                balance -= withdraw;
                                System.out.println("your withdrawned value is:" + withdraw);
                            }
                            break;
                        default:
                            break;
                    }
                } while (option != 4);
                System.out.println("see you later");
                break;
            } else {
                System.out.println("your password is remaining:" + --passright);
                    if (passright == 0) {
                        System.out.println("plz apply your bank officers");
                    } else {
                        System.out.println("welcome after some failed try" );}
            }
        }
    }
}



