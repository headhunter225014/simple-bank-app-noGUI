//Damir Zababuryn

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void printMenuStart() {
        System.out.println();
        System.out.println("Must Set up account first");
        System.out.println();
        System.out.println("Choose an option: \n1) Set up account" +
                "\n2) Login to your account" +
                "\n3) Print all accounts (only for manager)" +
                "\n4) Withdraw money" +
                "\n5) Deposit money" +
                "\n6) Print account information" +
                "\n7) Take a loan" +
                "\n8) Enter 0 to exit");
        System.out.println();
    }
    public static void printMenu() {
        System.out.println();
        System.out.println("to use options 3-8 User must Login to account");
        System.out.println();
        System.out.println("Choose an option: \n1) Set up account" +
                "\n2) Login to your account" +
                "\n3) Print all accounts (only for manager)" +
                "\n4) Withdraw money" +
                "\n5) Deposit money" +
                "\n6) Print account information" +
                "\n7) Take a loan" +
                "\n8) Enter 0 to exit");
        System.out.println();
    }

    public static void main(String[] args) {

        Bank american = new Bank("Bank of America", 50);// bank initialization
        Bank wellsFargo = new Bank("Wells Fargo", 30);
        Bank jpMorgan = new Bank("JP MorganChase", 25);

        ArrayList<Account> americanAccounts = new ArrayList<>();// accounts lists inizitalization
        ArrayList<Account> wellsFargoAccounts = new ArrayList<>();
        ArrayList<Account> jpMorganAccounts = new ArrayList<>();
        ArrayList<BankManager> managerList = new ArrayList<>();

        BankManager americanManager = new BankManager("Michael", "Bank of America", "MichaelBofA");// managers list initiliaztion
        BankManager wellsFargoManager = new BankManager("John", "Wells Fargo", "JohnWF");
        BankManager jpMorganManager = new BankManager("Alex", "JP MorganChase", "AlexJPM");

        managerList.add(americanManager);
        managerList.add(wellsFargoManager);
        managerList.add(jpMorganManager);

        Random rand = new Random();



        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the international bank");


        printMenuStart();
        System.out.println();


        String login1 = null;
        String password1 = null;
        int isBankManager = 0;
        Account br = null;
        BankManager bm = null;
        int x = scnr.nextInt();


        while (x != 0) {

            if (x == 1) //first cas is for seting up account and putting it in the right arraylist
            {
                System.out.println("set up account");// creating login
                System.out.println("Create login: ");
                String login = scnr.next();

                System.out.println("Create a password");// creating a password
                String password = scnr.next();

                System.out.println("Choose the bank name (enter the number):" +
                        "\n1) Bank of America" +
                        "\n2) Wells Fargo" +
                        "\n3) JP MorganChase");// choosing
                int bankTypeNumber = scnr.nextInt();
                String bankType = "";
                int bankEnter;

                if (bankTypeNumber == 1) {
                    bankType = "Bank of America";
                } else if (bankTypeNumber == 2) {
                    bankType = " Wells Fargo";
                } else if (bankTypeNumber == 3) {
                    bankType = " JP MorganChase";
                }

                System.out.println("Enter the amount you want to open your account with: ");

                double hold = scnr.nextDouble();

                int idNumber = rand.nextInt(1000000);
                if (bankTypeNumber == 1) {
                    Account account1 = new Account(idNumber, login, password, hold, bankType);
                    americanAccounts.add(account1);
                } else if (bankTypeNumber == 2) {
                    Account account1 = new Account(idNumber, login, password, hold, bankType);
                    wellsFargoAccounts.add(account1);
                } else if (bankTypeNumber == 3) {
                    Account account1 = new Account(idNumber, login, password, hold, bankType);
                    jpMorganAccounts.add(account1);
                }
            }
            else if (x == 2) // login in into your account,
            {
                isBankManager = 0;
                System.out.println("Login into your account");
                System.out.println("Is it manager account?(Enter Number)" +
                        "\n1) yes" +
                        "\n2) no");
                int manager = scnr.nextInt();

                if (manager == 2) // procces login if not a manager
                {
                    System.out.println("What bank?(Enter Number)" +
                            "\n1) Bank of America" +
                            "\n2) wells Fargo" +
                            "\n3) JP MorganChase");
                    int bank = scnr.nextInt();
                    System.out.println("Enter your login");
                    String login2 = scnr.next();
                    System.out.println("Enter your password");
                    String password2 = scnr.next();
                    if (bank == 1) {
                        for (int i = 0; i < americanAccounts.size(); i++)
                        {
                            if (login2.equals(americanAccounts.get(i).getLogin()))
                            {
                                login1 = login2;
                                if (password2.equals(americanAccounts.get(i).getPassword())) {
                                    password1 = password2;
                                    System.out.println("You are in the system");
                                    br = americanAccounts.get(i);
                                } else {
                                    System.out.println("Wrong password or login");
                                }
                            }
                            else
                                System.out.println("Wrong password or login");
                        }
                    } else if (bank == 2) {
                        for (int i = 0; i < wellsFargoAccounts.size(); i++) {
                            if (login2.equals(wellsFargoAccounts.get(i).getLogin())) {
                                login1 = login2;
                                if (password2.equals(wellsFargoAccounts.get(i).getPassword())) {
                                    password1 = password2;
                                    br = wellsFargoAccounts.get(i);
                                    System.out.println("You are in the system");
                                } else {
                                    System.out.println("Wrong password or login");
                                }
                            }
                            else
                                System.out.println("Wrong password or login");
                        }
                    } else if (bank == 3) {
                        for (int i = 0; i < jpMorganAccounts.size(); i++) {
                            if (login2.equals(jpMorganAccounts.get(i).getLogin())) {
                                login1 = login2;
                                if (password2.equals(jpMorganAccounts.get(i).getPassword())) {
                                    password1 = password2;
                                    br = jpMorganAccounts.get(i);
                                    System.out.println("You are in the system");
                                } else {
                                    System.out.println("Wrong password or login");
                                }
                            }
                            else
                                System.out.println("Wrong password or login");
                        }
                    }
                } else if (manager == 1)//proccess login if manager
                {
                    isBankManager++;
                    System.out.println("Enter your login: ");
                    String login2 = scnr.next();

                    System.out.println("Enter your password: ");
                    String password2 = scnr.next();
                    int c = 0;

                    for(int i = 0; i < managerList.size(); i++)
                    {
                        if (login2.equals(managerList.get(i).getManagerName()))
                        {
                            login1 = login2;
                            if (password2.equals(managerList.get(i).getPassword())) {
                                password1 = password2;
                                System.out.println("You are in the system");
                                bm = managerList.get(i);
                                break;
                            } else {
                                c++;
                            }
                        }
                        else
                            c++;
                    }
                    if(c == 3)
                    {
                        System.out.println("Wrong passwrod or login");
                    }
                }
            }
            else if (x == 3) //print all accounts, login before
            {
                if(isBankManager > 0)
                {
                    System.out.println("You have access.");
                    String bankname2 = bm.getBankName();
                    if(bankname2.equals("Bank of America"))
                    {
                        for(int a = 0; a < americanAccounts.size(); a++)
                        {
                            System.out.println("User login: " + americanAccounts.get(a).getLogin());
                            System.out.println("Amount of money on his account: " + americanAccounts.get(a).getHold());
                            System.out.println();
                        }
                    }
                    else if(bankname2.equals("Wells Fargo"))
                    {
                        for(int a = 0; a < wellsFargoAccounts.size(); a++)
                        {
                            System.out.println(wellsFargoAccounts.get(a).getLogin());
                            System.out.println(wellsFargoAccounts.get(a).getHold());
                        }
                    }
                    else if(bankname2.equals("MorganChase"))
                    {
                        for(int a = 0; a < jpMorganAccounts.size(); a++)
                        {
                            System.out.println(jpMorganAccounts.get(a).getLogin());
                            System.out.println(jpMorganAccounts.get(a).getHold());
                        }
                    }
                }
                else
                {
                    System.out.println("You don't have access");
                }

            }
            else if (x == 4)// withdraw money, login before
            {
                if(isBankManager == 0)
                {
                    System.out.println("Enter the amount you want to withdraw");
                    double withdraw = scnr.nextDouble();
                    br.withdraw(withdraw);
                    System.out.print("Account Balance: ");
                    System.out.println(br.getHold());
                }
                else
                {
                    System.out.println("You are the manager and you are not allowed for that operation");
                }
            }
            else if (x == 5) // deposit money, login before
            {
                if(isBankManager == 0)
                {
                    System.out.println("Enter the amount you want to deposit");
                    double deposit = scnr.nextInt();
                    br.deposit(deposit);
                    System.out.print("Account Balance: ");
                    System.out.println(br.getHold());
                }
                else
                {
                    System.out.println("You are the manager and you are not allowed for that operation");
                }
            }
            else if (x == 6) //print account info
            {
                if(isBankManager == 0)
                {
                    System.out.println("Name of the holder: " + br.getLogin());
                    System.out.println("Account Balance: " + br.getHold());
                    System.out.println("Bank name: " + br.getBankName());
                    System.out.println("Your account idNumber: " + br.getIdNumber());
                    int size = br.getLoansList().size();
                    if(size > 0)
                    {
                        System.out.println("Loans: ");
                    }
                    for(int i = 0; i < size; i++)
                    {
                        br.getLoansList().get(i).infoAboutLoan();
                    }
                }
                else
                {
                    System.out.println("You are the manager and you are not allowed for that operation");
                }


            }
            else if (x == 7) // take a loan
            {
                if (isBankManager == 0) {
                    Loan loans = new Loan();


                    System.out.println("Choose a type / purpose of loan"); // choosing the purpose of the loan
                    System.out.println("Loan Options are: \n1) House" +
                            "\n2) Automobile" +
                            "\n3) School");
                    System.out.println("Please enter a Loan type twice for verification: ");
                    int typeLoan = scnr.nextInt();
                    double intRate = 0.0;


                    if (typeLoan == 1) // house option, problems with printing months
                    {
                        System.out.println("How much money do you need for your Loan?");//amount for loan
                        System.out.print("Enter Amount: ");
                        loans.setLoanAmount(scnr.nextDouble());

                        System.out.println("How many years do you need for your Loan?");// years of the loan
                        System.out.println("Enter amount of months: ");
                        double loanTime = scnr.nextDouble();
                        // checking the corectness of the year
                        while (loanTime <= 0) {
                            System.out.println("Enter the number that bigger than 0: ");
                            loanTime = scnr.nextDouble();
                        }
                        loans.setLoanTime(loanTime);

                        loanTime = loans.getLoanTime();

                        if (loanTime <= 120) {
                            intRate = loans.getIntTenRate();
                        } else if (loanTime <= 180) {
                            intRate = loans.getIntFifRate();
                        } else if (loanTime <= 300) {
                            intRate = loans.getIntTwentRate();
                        } else if (loanTime <= 450) {
                            intRate = loans.getIntThirtrate();
                        }

                        double loanAmount = loans.getLoanAmount();
                        loans.setIntRate(intRate);
                        //create a method that will print total money u will spend on your house
                        System.out.println("Your Loan is $" + loanAmount + " over " + loanTime + " months. With an intrest rate of " + intRate + "%");

                    } else if (typeLoan == 2)  //new used car option
                    {

                        System.out.println("1)New " +
                                "\n2) Used");
                        int usedNew = scnr.nextInt();

                        if (usedNew == 1) { //option for new cars
                            System.out.println("How much money do you need for your Loan?");
                            System.out.println("Enter Amount: ");
                            loans.setLoanAmount(scnr.nextDouble());

                            System.out.println("How many months do you need for your Loan?");
                            System.out.println("Enter amount of months: ");

                            double loanTime = scnr.nextDouble();
                            // checking the corectness of the year
                            while (loanTime <= 0) {
                                System.out.println("Enter the number that bigger than 0: ");
                                loanTime = scnr.nextDouble();
                            }
                            loans.setLoanTime(loanTime);

                            loanTime = loans.getLoanTime();

                            if (loanTime <= 72) {
                                intRate = loans.getLoanTimeNewLessThan3();
                            } else {
                                intRate = loans.getLoanTimeNewMoreThan3();
                            }
                            double loanAmount = loans.getLoanAmount();
                            loanTime = loans.getLoanTime();
                            loans.setIntRate(intRate);
                            System.out.println("Your Loan is $" + loanAmount + " over " + loanTime + " months. With an intrest rate of " + intRate + "%");
                            // add method to calculate the whole number
                        } else if (usedNew == 2)//option for used cars
                        {
                            System.out.println("How much money do you need for your Loan?");
                            System.out.println("Enter Amount: ");
                            loans.setLoanAmount(scnr.nextDouble());

                            System.out.println("How many months do you need for your Loan?");
                            System.out.println("Enter amount of months: ");
                            double loanTime = scnr.nextDouble();

                            while (loanTime <= 0) {
                                System.out.println("Enter the number that bigger than 0: ");
                                loanTime = scnr.nextDouble();
                            }

                            loans.setLoanTime(loanTime);
                            if (loanTime <= 72) {
                                intRate = loans.getLoanTimeUsed();
                            } else {
                                intRate = loans.getLoanTimeUsedBig();
                            }
                            double loanAmount = loans.getLoanAmount();
                            loanTime = loans.getLoanTime();
                            loans.setIntRate(intRate);
                            System.out.println("Your Loan is $" + loanAmount + " over " + loanTime + " months. With an intrest rate of " + intRate + "%");


                        }
                    } else if (typeLoan == 3)//
                    {
                        System.out.println("What type of school do you need this Loan for? ");
                        System.out.println("Choose an option: \n1) Undergraduate Degree" +
                                "\n2) Masters Degree" +
                                "\n3) Medical School" +
                                "\n4) Law School" +
                                "\n5) Doctoral Degree");
                        int studentLoanType = scnr.nextInt();
                        String school = "";
                        if (studentLoanType == 1) {
                            school = "Undergraduate Degree";
                        } else if (studentLoanType == 2) {
                            school = "Masters Degree";
                        } else if (studentLoanType == 3) {
                            school = "Medical School";
                        } else if (studentLoanType == 4) {
                            school = "Law school";
                        } else if (studentLoanType == 5) {
                            school = "Doctoral Degree";
                        }

                        System.out.println("How much money do you need for your Loan?");
                        System.out.println("Enter Amount: ");
                        loans.setLoanAmount(scnr.nextDouble());
                        loans.setLoanTime(48);
                        double loanAmount1 = loans.getLoanAmount();


                        if (loanAmount1 <= 5000) {
                            intRate = loans.getStudentRateOne();
                        } else if (loanAmount1 <= 10000) {
                            intRate = loans.getStudentRateTwo();
                        } else if (loanAmount1 <= 15000) {
                            intRate = loans.getStudentRateThree();
                        } else if (loanAmount1 <= 20000) {
                            intRate = loans.getStudentRateFour();
                        } else if (loanAmount1 <= 25000) {
                            intRate = loans.getStudentRateFive();
                        } else if (loanAmount1 > 25000) {
                            intRate = loans.getStudentRateSix();
                        }
                        loans.setIntRate(intRate);
                        System.out.println("Your Loan is $" + loanAmount1 + " over " + school + " peroid of time. With an intrest rate of " + intRate + "%");

                    } else {
                        System.out.println("Did not enter a valid Loan type.");
                        System.out.println("Please enter a vaild Loan type: ");
                        typeLoan = scnr.nextInt();
                    }
                    br.getLoansList().add(loans);
                } else {
                    System.out.println("You are the manager and you are not allowed for that operation");
                }
            }
            else {
                System.out.println("There is no such an option");
            }

            printMenu();
            x = scnr.nextInt();
        }
        System.out.println("Thanks for using our application");
    }
}



