package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    Double[] transactions = new Double[1000];

    // Pointer to follow the next available index in the transactions array
    int transactionCount = 0;

    // Constructor to initialize the account state upon instantiation
    public BankAccount(String name, int startingBalance){
        this.name=name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        if(amount>0){ //We check if the amount value is valid
            currentBalance+=amount; //we add the amount to the balance
            transactions[transactionCount]=amount; //We mark the transaction
            transactionCount++; //We update the transactionCount
            //printing the operation
            System.out.println("depositor's name = "+name+ " , deposited amount = "+amount+" , new balance = "+currentBalance);
        }else{
            System.out.println("Error : it's an unseccessuful deposit ! "); //in case of a negative value(invalid value)
        }
    }

    public void withdraw(double amount){
        if(amount<=currentBalance && amount>0){ //We check if the value is positive and that the amount is bigger than the balance
            currentBalance-=amount; //We remove the amount from the balance
            transactions[transactionCount]=-(amount); //We mark the transaction
            transactionCount++; //We update the transactionCount
        }else{
            System.out.println("Error : it's an unseccessuful withdrawal ! "); //in case of an invalid value
        }
    }

    public void displayTransactions(){
        for (int i=0;i<transactionCount;i++){ //we loop on the transactions array to get the transactions done
            if(transactions[i]>0){ //Case of a deposit
                System.out.println("Deposit of "+transactions[i]);
            }else if(transactions[i]<0){ //Case of a withdrawal
                System.out.println("Withdrawal of "+(-(transactions[i])));
            }
        }
    }

    public void displayBalance(){
        System.out.println("Current balance = "+currentBalance); //printing the current balance
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
