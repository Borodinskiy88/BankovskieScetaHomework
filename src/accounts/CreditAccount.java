package accounts;

public class CreditAccount extends Account { //кредитный,
    // не может уходить в плюс

    public CreditAccount(int amount, String name) {
        this.amount = amount;
        this.name = name;

    }

    @Override
    public void pay(int amount) { //заплатить
        super.pay(amount);
        int money = -amount;
        setAmount(money);
        System.out.println("Списание со счета " + this.name + " " + amount + " рублей");
        System.out.println("Баланс счета " + this.amount + " рублей");
        System.out.println();
    }

    @Override
    public void addMoney(int amount) { //пополнить
        super.addMoney(amount);
        int balance = this.amount + amount;
        if (balance > 0) {
            System.out.println("Внесенная сумма превышает текущую задолженность! "
                    + "Текущая задолженность составляет " + this.amount + " рублей");
            System.out.println("Внесите сумму, не превышающую " + -this.amount + " рублей");
            System.out.println();
        } else {
            int money = +amount;
            setAmount(money);
            System.out.println("Пополнение счета" + " " + this.name + " на " + amount + " рублей");
            System.out.println("Текущий баланс счета составляет " + this.amount + " рублей");
            System.out.println();
        }
    }
}
