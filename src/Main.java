import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account checkingAccount = new CheckingAccount(10_000, "'Расчетный'");
        Account creditAccount = new CreditAccount(-70_000, "'Кредитный'");
        Account savingAccount = new SavingAccount(50_000, "'Сберегательный'");


        checkingAccount.transfer(savingAccount, 9000);
        checkingAccount.transfer(savingAccount, 2000);
        checkingAccount.addMoney(5000);
        checkingAccount.pay(3000);

        savingAccount.transfer(checkingAccount, 1000);
        savingAccount.addMoney(20000);

        creditAccount.pay(30000);
        creditAccount.addMoney(500000);
        creditAccount.addMoney(2000);

    }
}
