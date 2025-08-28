public class Account {
    private String name;
    private double balance;
    private int number;
    private double limit;

    public Account(String name, double balance,int number,double limit)

    {
        this.name = name;
        this.number = number;
        this.limit= limit;


        if (balance>0.0)
            this.balance=balance;
    }

    public void deposit(double depositAmount)
    {
        if(depositAmount>0.0)
        balance=balance+depositAmount;
    }

    public void imprimeDados()
    {
            System.out.printf("Conta: %d | Nome: %s | Saldo: %.2f | Limite: %.2f%n",number, name, balance, limit);
    }


    public void setName(String name)
    {
        this.name=name;
    }

    public void setNumber(int number)
    {
        this.number=number;
    }

    public void setLimit(double limit)
    {
        this.limit=limit;
    }



    public double getBalance()
    {
        return balance;
    }

    
    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

    public double getLimit()
    {
        return limit;
    }
}
