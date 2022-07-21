package accounts;

public abstract class Account implements AccountI {
    public int amount;
    public String name;
    public final String limit = "Превышен лимит! Операция невозможна!";

    public void Account(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int money) {
        amount += money;
    }

    public void pay(int amount) {

    } //заплатить

    public void transfer(Account account, int amount) { //перевести
    }

    public void addMoney(int amount) {

    } //пополнить

    public String toString() {
        return name;
    }

}
