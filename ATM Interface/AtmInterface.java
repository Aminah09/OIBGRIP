import java.util.Objects;
import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {
        int ch1,ch2 = 0;
        int Balance = 10000;
        String RegistUsername, Username;
        String RegistPassword, Password;

        System.out.println("\n****** Registration Portal ******\n");

        System.out.print("Enter name : ");
        Scanner scan1 = new Scanner(System.in);
        String Name = scan1.next();

        System.out.print("Enter username : ");
        Scanner scan2 = new Scanner(System.in);
        RegistUsername = scan2.next();

        System.out.print("Enter password : ");
        Scanner scan3 = new Scanner(System.in);
        RegistPassword = scan3.next();

        System.out.println("Registration completed successfully !!");

        System.out.println("\nDashboard");
        System.out.println("1. Login ");
        System.out.print("2. Exit \n Choice : ");
        Scanner scan9 = new Scanner(System.in);
        ch1 = scan9.nextInt();

        if (ch1 == 1) {
            System.out.print("\nEnter username : ");
            Scanner scan4 = new Scanner(System.in);
            Username = scan4.next();

            System.out.print("Enter password : ");
            Scanner scan5 = new Scanner(System.in);
            Password = scan5.next();

            if (Objects.equals(Username, RegistUsername) && Objects.equals(Password, RegistPassword)) {
                System.out.println("\nWelcome " + Name);

                while (ch2 != 6) {
                    System.out.println("\n  ********* ATM *********");
                    System.out.println("   |  1. Deposit      |");
                    System.out.println("   |  2. Withdraw     |");
                    System.out.println("   |  3. Transfer     |");
                    System.out.println("   |  4. View balance |");
                    System.out.println("   |  5. Exit         |");
                    System.out.print("\nChoice : ");
                    Scanner choice2 = new Scanner(System.in);
                    ch2 = choice2.nextInt();
                    switch (ch2) {
                        case 1 -> {
                            System.out.print("\nEnter the amount to deposit : ");
                            Scanner scan6 = new Scanner(System.in);
                            int Deposit = scan6.nextInt();
                            if (Deposit <= Balance) {

                                Balance = Balance + Deposit;

                                System.out.println("\nThe amount has been successfully deposited");

                                System.out.println("Available Balance  : " + Balance);

                                System.out.println("Transaction history of deposit : " + Deposit);

                            } else {
                                System.out.println("\nPlease enter the minimum balance to get deposited ");
                            }
                            System.out.println();
                        }
                        //break;

                        case 2 -> {
                            System.out.print("\nEnter the amount to withdraw : ");
                            Scanner scan7 = new Scanner(System.in);
                            int Withdraw = scan7.nextInt();
                            if (Balance >= Withdraw) {
                                Balance = Balance - Withdraw;


                                System.out.println("Available Balance : " + Balance);

                                System.out.println("Transaction history of withdrawal :" + Withdraw);

                            } else {
                                System.out.println("Insufficient balance !");
                            }
                            System.out.println();
                        }
                        // break;

                        case 3 -> {
                            System.out.print("\nEnter the amount to transfer : ");
                            Scanner scan8 = new Scanner(System.in);
                            int Transfer = scan8.nextInt();
                            if (Transfer <= Balance) {

                                Balance -= Transfer;

                                System.out.println("\nThe amount has been successfully transferred");

                                System.out.println("Available Balance : " + Balance);

                                System.out.println("Transaction history of Transfer : " + Transfer);
                            }
                        }

                        case 4 -> {

                            System.out.println("\nYour current balance is : " + Balance);
                        }

                        case 5 ->

                                System.out.println("Thank you !! Visit Again ...");
                        default ->

                                System.out.println("Invalid choice");
                    }
                }
            } else {
                System.out.println("\nIncorrect password !!");
                System.out.println("Try again");
            }
        }
        else if (ch1 == 2) {
            System.out.println("\nThank you !! Visit Again ...");
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
