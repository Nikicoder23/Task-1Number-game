public class ATM {
  
     public static void main(String args[])
    {
        int balance = 50000;
        int withDraw = 5000;
        int deposit = 20000;
        Balance(balance);
        balance = Withdraw(balance,withDraw);
        balance = Deposit(balance, deposit);
    }
    
    public static void Balance(int bal)
    {
        System.out.println("Current Balance is : " + bal);
        System.out.println();
    }

    public static int Withdraw(int balance, int withdrawRupees)
    {
        System.out.println("Withdraw:");
        System.out.println("Withdraw Amount : " + withdrawRupees);
        if (balance >= withdrawRupees) {
            balance = balance - withdrawRupees;
            System.out.println( "Please collect your money and card");
            Balance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Money");
            System.out.println();
        }
        return balance;
    }
  
    public static int Deposit(int balance,   int depositRupees)
    {
        System.out.println("Deposit:");
        System.out.println("Deposit Amount : "  + depositRupees);
        balance = balance + depositRupees;
        System.out.println(  "Your Money has been successfully deposited");
        Balance(balance);
        return balance;

       
    }
  
   
}
