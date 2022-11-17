import java.util.Scanner;

public class bankaccount
{

    int accno;
    double balance;

    Scanner in= new Scanner(System.in);

    bankaccount (int a, double b)
    {
        this.accno=a;
        this.balance=b;

    }


    void withdraws() throws Exception
    {
        double amount;
        System.out.println("enter amount");
        amount=in.nextInt();
        if (balance>=amount)
        {
            balance= balance-amount;
            System.out.println("balance remaining is "+balance);
        }
        else
        {
            throw new Exception("not sufficient balance");

        }
    }

    void deposit()
    {
        int amount;
        System.out.println("enter deposit amount");
        amount=in.nextInt();
        if (amount>=0)
        {
            balance=balance+amount;
            System.out.println(" updated balance is "+balance);
        }
        else
        {
            System.out.println("invalid");
        }
    }

    void show ()
    {
        System.out.println("account no is "+accno+"balance is " +balance);
    }

}
 class bank
{
    public static void main(String args [])
    {
       bankaccount obj=new bankaccount(12345, 5000);
        Scanner in= new Scanner(System.in);
        obj.show();
        obj.deposit();
        obj.show();
        try
        {   obj.withdraws();
        }

        catch (Exception b)
        {
            System.out.println(b);
        }

        obj.show();

    }
}