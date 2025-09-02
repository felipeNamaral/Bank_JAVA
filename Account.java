public class Account {
    private String name;
    private double balance;
    private int number;
    private double limit;
    private String senha;

    public Account() {
        this.balance = 0.0;
        this.senha = "0000";

    }

    public Account(String name, int number, double limit) {
        this();
        this.name = name;
        this.number = number;
        this.limit = limit;

    }

    public void withdraw(double value) {
        if (value > balance) {
            if (value < limit) {
                balance -= value;
            }
        } else if (value <= balance) {
            balance -= value;
        }
    }

    public void changePassword(String oldPass, String newPass)
    {
        if(oldPass.equals(this.senha))
        {
            this.senha=newPass;
            System.out.println("Senha Trocada!!!!");
        }else{
            System.out.println("Senha antiga incorreta!!!!");
        }
    } 


    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public void imprimeDados() {
        System.out.printf("Conta: %d | Nome: %s | Saldo: %.2f | Limite: %.2f%n", number, name, balance, limit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getLimit() {
        return limit;
    }
}
