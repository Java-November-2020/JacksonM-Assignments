import java.util.Random;

public class BankAccount{
    String accountNumber;
    double checkingBalance;
    double savingBalance;
    private static int numberOfAccountsCreated;
    private static double totalAmountOfMoney;
    String acc_checking= "CHECKING";
    String acc_saving = "SAVINGS";

    private static String randomAccountNumber(){
        String accNum = "";
        for(int i= 0; i<10;i++){
            Random rand = new Random();
            int upperbound = 10;
            int randomValue = rand.nextInt(upperbound);
            accNum += randomValue;
        }
        return accNum;
    }

    public void BankAccount(){
        accountNumber = randomAccountNumber();
        System.out.println("Account Number : " + accountNumber);
        numberOfAccountsCreated = numberOfAccountsCreated + 1;
    }

    public void getCheckingAccountBalance(){
        this.checkingBalance = checkingBalance;
        System.out.println("Checking Account: " + this.checkingBalance);
    }

    public void getSavingAccountBalance(){
        this.savingBalance = savingBalance;
        System.out.println("Savings Account: " + this.savingBalance);
    }

    // public void setCheckingAccountBalance(int accChecking){
    //     this.checkingBalance = accChecking;
    //     System.out.println(this.checkingBalance);
    // }

    // public void setSavingAccountBalance(int accSaving){
    //     this.savingBalance = accSaving;
    //     System.out.println(this.savingBalance);
    // }

    public void depositMoney(String typeOfAccount, int depoMoney){
        // System.out.println(typeOfAccount);
        // System.out.println(typeOfAccount.toUpperCase());
        if (typeOfAccount.toUpperCase().equals(acc_checking)){
            checkingBalance += depoMoney;
        }
        else if (typeOfAccount.toUpperCase().equals(acc_saving)){
            savingBalance += depoMoney;
        }
        else{
            System.out.println("Please enter the info correctly");
        }
        totalAmountOfMoney = checkingBalance + savingBalance;
    }

    public void withdrawMoney(String typeOfAccount, int amount){
        if ((typeOfAccount.toUpperCase().equals(acc_checking)) && (checkingBalance > 100)){
            checkingBalance -= amount;
        }
        else if ((typeOfAccount.toUpperCase().equals(acc_saving)) && (savingBalance > 300)){
            savingBalance -= amount;
        }
        else{
            System.out.println("You are not allowed to withdraw money from your account. Please reach out to your bank for more info.");
        }    
    }

    public void totalMoney(){
        System.out.println("Total Amount of money in the bank (including checking & saving) is: " + totalAmountOfMoney);
    }
}