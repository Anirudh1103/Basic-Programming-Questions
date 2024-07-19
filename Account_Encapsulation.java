public class Account_Encapsulation {
    String Name;
    int AcNo;
    double Balance;

    Account_Encapsulation(String Name, int AcNo, double Balance) {
        this.Name = Name;
        this.AcNo = AcNo;
        this.Balance = Balance;
    }

    public void Deposit(int amount)
    {
        Balance+=amount;
        System.out.println("Deposit successful.");
        System.out.println("Balance: " + Balance);
        System.out.println("----------------------------------------------------------------");
    }
    public void Withdraw(int amount)
    {
        if(amount<Balance)
        {
            Balance-=amount;
            System.out.println("Withdraw successful.");
            System.out.println("Balance: " + Balance);
            System.out.println("----------------------------------------------------------------");

        }

    }
    public void AccountDetails()
    {
        System.out.println("Name: " + Name);
        System.out.println("AcNo: " + AcNo);
        System.out.println("Bal : " + Balance);
    }

    public static void main(String[] args) {
        Account_Encapsulation obj = new Account_Encapsulation("Amith",1120,50000);
        obj.Withdraw(30000);
        obj.Deposit(10000);
        obj.AccountDetails();
    }
}
//Getter -> returns the data which is read (read)
//Setter -> Modifies of sets the data (this.)

/*Encapsulation:
    The process of binding the statement behaviour to achieve data hiding using access specifier
 */
