package accounts;

public class CheckingAccount extends Account { //расчетный,
    // не может уходить в минус

    public CheckingAccount(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void transfer(Account account, int amount) {
        super.transfer(account, amount);
        int balance = this.amount - amount;

        if (balance < 0) {
            System.out.println(limit);
            System.out.println();
        } else {
            int money = -amount;
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
//        System.out.println("Баланс счета " + getAmount() + " рублей");
        System.out.println("Баланс счета " + this.name + " " + this.amount + " рублей");
        System.out.println();
    }

    @Override
    public void pay(int amount) { //заплатить
        super.pay(amount);
        int balance = this.amount - amount;
        if (balance < 0) {
            System.out.println(limit);
            System.out.println();
        } else {
            int money = -amount;
            setAmount(money);
            System.out.println("Списание со счета " + this.name + " " + amount + " рублей");
            System.out.println("Баланс счета " + this.amount + " рублей");
            System.out.println();
        }
    }
}
