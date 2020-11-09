public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bcc = new BankAccount();
        bcc.getCheckingAccountBalance();
        bcc.getSavingAccountBalance();
        String acc = "Checking";
        String svg = "savings";
        bcc.depositMoney(acc, 2000);
        bcc.depositMoney(svg, 500);
        bcc.getCheckingAccountBalance();
        bcc.getSavingAccountBalance();
        bcc.withdrawMoney(acc, 500);
        bcc.getCheckingAccountBalance();
        bcc.totalMoney();

    }
}
