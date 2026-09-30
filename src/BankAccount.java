public class BankAccount {

    protected String accountName;
    protected int accountBalance;

    public BankAccount(String accountName, int accountBalance){
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public String display(){
        return "This is the account holder's name " + accountName + " and the bank balance is " + accountBalance + " pounds.";
    }
}

class BankAccountMain{
    public static void main(String[] args){
        BankAccount bankAccount1 = new BankAccount("Ronoh Cheptanui", 120000000);

        System.out.println(bankAccount1.display());
    }
}
