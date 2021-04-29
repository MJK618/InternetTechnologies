import java.util.ArrayList;
import java.util.Scanner;

public class java_4 {

    static class Account {
        private int acc;
        private int balance;
        private final String name;
        private final ArrayList<Account> accounts;

        {
            accounts = new ArrayList<>();
        }

        Account(int x) {

            acc = x;
            balance = 0;
            name = "Test";
            accounts.add(new Account("Default" +
                    " Account Name 1", acc));
            acc++;
            accounts.add(new Account("Default" +
                    " Account Name 2", acc));
            acc++;
        }

        Account(String name, int acc) {
            this.acc = acc;
            balance = 0;
            this.name = name;
        }


        public void createExist() {

            int ch;
            do {
                existingAccountsMenu();

                Scanner sc = new Scanner(System.in);
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        this.getBal();
                        break;
                    case 2:
                        this.withdrawal();
                        break;
                    case 3:
                        this.deposit();
                        break;
                    case 4:
                        menu();
                    default:
                        System.out.println("\n\t XXXXX--" +
                                " INVALID INPUT --XXXXX \n");
                }
            } while (ch != 9);
        }

        public void menu() {
            int ch;
            do {
                bankOperationsMenu();

                Scanner sc = new Scanner(System.in);
                ch = sc.nextInt();
                switch (ch) {

                    case 1:
                        this.createAccount();
                        break;
                    case 2:
                        this.showBankBal();
                        break;
                    case 3:
                        this.maxMin();
                        break;
                    case 4:
                        this.checkBal();
                        break;
                    case 5:
                        this.checkAccount();
                        break;
                    case 6:
                        this.createExist();
                        break;
                    case 7:
                        this.showAllAccountDetails();
                    case 8:
                        System.exit(0);
                    default:
                        System.out.println("\n\t XXXXX--" +
                                " INVALID INPUT --XXXXX \n");
                }
            } while (ch != 9);

        }

        private void showAllAccountDetails() {
            int count = 0;
            for (Account account : accounts) {
                count++;
                System.out.print(count + ". ");
                showAccountDetails(account);
                System.out.println("----------------" +
                        "--------------");
            }
        }

        public void getBal() {
            System.out.println("Enter Account Number: ");
            Scanner inp = new Scanner(System.in);
            int ac = inp.nextInt();
            int f = 1;
            for (Account account : accounts) {
                if (ac == account.acc) {
                    f = 0;
                    displayMaxOrMinAccountDetails(account.balance,
                            account.acc,
                            account.name,
                            "Account Holder Name: ",
                            "\nAccount Number: ",
                            "\nAccount Balance => ₹");
                    break;
                }
            }

            if (f == 1) System.out.println("\nAccount " +
                    "Does Not" +
                    " Exists");
        }

        public void withdrawal() {
            System.out.println("Enter Account Number: ");
            Scanner inp = new Scanner(System.in);
            int ac = inp.nextInt();
            int f = 1;
            for (Account account : accounts) {
                if (ac == account.acc) {
                    f = 0;
                    showAccountDetails(account);
                    System.out.println("\nConfirm " +
                            "Account's details" +
                            " and proceed ahead " +
                            "\nEnter withdrawal " +
                            "amount (₹): ");
                    int withdraw = inp.nextInt();
                    if (withdraw > account.balance) {
                        System.out.println("Insufficient " +
                                "Balance To" +
                                " Withdraw");
                    } else if (withdraw <= 0) {
                        System.out.println("Invalid " +
                                "withdrawal amount");
                    } else {
                        account.balance -= withdraw;
                        System.out.println("Account's " +
                                "Updated Balance " +
                                "is: ₹" + account.balance);
                    }
                    break;
                }
            }
            if (f == 1) {
                System.out.println("\nAccount Does " +
                        "Not Exists");
            }
        }

        private void showAccountDetails(Account account) {
            System.out.println("Account Holder Name: " +
                    account.name +
                    "\nAccount Number: " +
                    account.acc +
                    "\nAccount Balance => ₹" +
                    account.balance);
        }

        public void deposit() {
            System.out.println("Enter Account Number: ");
            Scanner inp = new Scanner(System.in);
            int ac = inp.nextInt();
            int f = 1;
            for (Account account : accounts) {
                if (ac == account.acc) {
                    f = 0;
                    showAccountDetails(account);
                    System.out.println("\nConfirm " +
                            "Account's details and" +
                            " proceed ahead \nEnter " +
                            "deposit amount (₹): ");
                    int deposit = inp.nextInt();
                    if (deposit <= 0) {
                        System.out.println("Invalid " +
                                "deposit amount");
                    } else if (deposit > 10000) {
                        int a = tax_red(deposit);
                        account.balance += a;
                        System.out.println("\nAs the amount" +
                                " exceeded the" +
                                " minimum tax slab " +
                                "of ₹10,000\n" +
                                "Tax deduction of 2% on " +
                                "deposit value of ₹" +
                                deposit +
                                " amounts to ₹" +
                                (deposit - a) +
                                "\nWe deposited ₹" +
                                a +
                                " amount in the account." +
                                "\nAccount's Updated " +
                                "Balance is: ₹" +
                                account.balance);
                    } else {
                        account.balance += deposit;
                        System.out.println("Account's " +
                                "Updated Balance is:" +
                                " ₹" + account.balance);
                    }
                    break;
                }
            }
            if (f == 1) {
                System.out.println("\nAccount Does Not Exists");
            }
        }

        public int tax_red(int d) {
            //this.bal+=x;
            return (int) (d - (.02 * d));
        }

        void createAccount() {
            System.out.println("Enter Account Holder's name: ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            this.acc++;
            accounts.add(new Account(name, this.acc));
            System.out.println("Welcome " + name + "\n"
                    + name + "'s " +
                    "Bank Account is successfully created" +
                    " with account " +
                    "no. => " + this.acc);
        }

        private void showBankBal() {
            int total = 0;
            for (Account account : accounts) {
                //System.out.println(accounts.get(i).bal);
                total += account.balance;
            }
            System.out.println("Total Amount in Bank: ₹"
                    + total);
        }

        private void maxMin() {
            int minValue = accounts.get(0).balance;
            int minValueAcc = accounts.get(0).acc;
            String minValueHolderName = accounts.get(0).name;

            for (int i = 1; i < accounts.size(); i++) {
                if (accounts.get(i).balance < minValue) {
                    minValue = accounts.get(i).balance;
                    minValueAcc = accounts.get(i).acc;
                    minValueHolderName = accounts.get(i).name;

                }
            }
            int maxValue = accounts.get(0).balance;
            int maxValueAcc = accounts.get(0).acc;
            String maxValueHolderName = accounts.get(0).name;

            for (int i = 1; i < accounts.size(); i++) {
                if (accounts.get(i).balance > maxValue) {
                    maxValue = accounts.get(i).balance;
                    maxValueAcc = accounts.get(i).acc;
                    maxValueHolderName = accounts.get(i).name;
                }
            }
            displayMaxOrMinAccountDetails(minValue,
                    minValueAcc,
                    minValueHolderName,
                    "Minimum Balance Holder's account" +
                            " number is: ",
                    " having Account no.: ", " " +
                            "with amount: ₹");
            displayMaxOrMinAccountDetails(maxValue,
                    maxValueAcc, maxValueHolderName,
                    "Maximum Balance Holder's account number is: ",
                    " having Account no.: ", " with amount: ₹");
        }

        private void checkBal() {
            System.out.println("Enter the amount to be" +
                    " checked (₹): ");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            int count = 0;
            for (int i = 1; i < accounts.size(); i++) {
                if (accounts.get(i).balance >= b) {
                    count++;
                }
            }
            System.out.println("Total accounts with " +
                    "balance greater" +
                    " than or equal to ₹" + b + " are: " + count);
        }

        private void checkAccount() {
            System.out.println("Enter Your Account " +
                    "Number: ");
            Scanner inp = new Scanner(System.in);
            int ac = inp.nextInt();
            int f = 1;
            for (Account account : accounts) {
                if (ac == account.acc) {
                    f = 0;
                    displayMaxOrMinAccountDetails(
                            account.balance,
                            account.acc, account.name,
                            "Account Holder Name: ",
                            "\nAccount Number: ",
                            "\nAccount Balance => ₹");
                    break;
                }
            }
            if (f == 1) {
                System.out.println("\nAccount Does Not " +
                        "Exists");
            }
        }
    }

    private static void bankOperationsMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Create New Account");
        System.out.println("2. Show Bank's Total Assets Value" +
                " (₹)");
        System.out.println("3. Show Maximum and Minimum " +
                "Account Balance Holders");
        System.out.println("4. Number of Accounts Above" +
                " Threshold Balance (₹)");
        System.out.println("5. Check for a Given Account" +
                " Number");
        System.out.println("6. Operate on Existing Accounts");
        System.out.println("7. Show all Accounts");
        System.out.println("8. Exit");
        System.out.println("Enter Your Choice: ");
    }

    private static void existingAccountsMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Get Balance (₹)");
        System.out.println("2. Withdraw from Bank");
        System.out.println("3. Deposit in Account (taxable" +
                " for amount > ₹10,000)");
        System.out.println("4. Go to Bank menu");
        System.out.println("Enter your choice: ");
    }

    private static void displayMaxOrMinAccountDetails(
            int minValue, int minValueAcc,
            String minValueHolderName,
            String s, String s2, String s3) {
        System.out.println(s
                + minValueHolderName
                + s2
                + minValueAcc
                + s3
                + minValue);
    }


    public static void main(String[] args) {
        int ch;
        Account bk = new Account(2000);
        Scanner sc = new Scanner(System.in);
        mainMenu();
        ch = sc.nextInt();
        if (ch == 1) {
            bk.createExist();
        } else {
            bk.menu();
        }
    }

    private static void mainMenu() {
        System.out.println("\n\t|-- Welcome to MJK Bank --|" +
                " \nPlease choose below from the available" +
                " services: \n");
        System.out.println("1. Operate on Existing Individual" +
                " Accounts (Default account numbers created" +
                " already: 2000, 2001)");
        System.out.println("2. Go to Bank Operations");
        System.out.println("Enter your choice: ");
    }
}