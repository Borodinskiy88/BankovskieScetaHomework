package accounts;

public class SavingAccount extends Account { //сберегательный,
    // не может уходить в минус

    public SavingAccount(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void transfer(Account account, int amount) { //перевод
        super.transfer(account, amount);
        int balance = this.amount - amount;

        if (balance < 0) {
            System.out.println(limit);
            System.out.println();
        } else {
            int money = - amount;
            account.amount = account.amount + amount;
            setAmount(money);
            System.out.println("Перевод со счета " + this.name + " на счет " + account + " "
                    + amount + " рублей");
            System.out.println("Остаток на счету " + this.amount + " рублей");
            System.out.println("Баланс счета " + account + " " + account.amount + " рублей");
            System.out.println();
        }
    }

    @Override
    public void addMoney(int amount) { //пополнение
        super.addMoney(amount);
        int money = +amount;
        setAmount(money);
        System.out.println("Пополнение счета " + this.name + " на " + amount + " рублей");
        System.out.println("Баланса счета " + this.name + " " + this.amount + " рублей");
        System.out.println();
    }
}
