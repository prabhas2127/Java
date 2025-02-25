class Bank_acc{
    protected String acc_holder;
    protected double balance;

    public Bank_acc(String acc_holder, double balance){
        this.acc_holder = acc_holder;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited : $" + amount);
    }

    public void display_balance(){
        System.out.println(acc_holder +"'s Account Balance : $" + balance);
    }
}

class Savings_acc extends Bank_acc{

    private double interest_rate;

    public Savings_acc(String acc_holder, double balance, double interest_rate){
        super(acc_holder, balance);
        this.interest_rate = interest_rate;
    }

    public void addInterest(){
        double interest = balance * (interest_rate / 100);
        balance += interest;
        System.out.println("Interest added : $" + interest);
    }
}

class Current_acc extends Bank_acc{
    private double overdraft_limit;

    public Current_acc(String acc_holder, double balance, double overdraft_limit){
        super(acc_holder, balance);
        this.overdraft_limit = overdraft_limit;
    }

    public void withdraw(double amount){
        if(balance + overdraft_limit >= amount){
            balance -= amount;
            System.out.println("Withdrawn amount : $" + amount);
        }else{
            System.out.println("Insufficient balance! Overdraft limit exceeded....");

        }
    }
}


public class Bank {
    public static void main(String[] args) {
        
        Savings_acc savings = new Savings_acc("maxx", 27000, 3);
        savings.display_balance();
        savings.addInterest();
        savings.display_balance();

        System.out.println();

        Current_acc current = new Current_acc("Bob", 2000, 1000);
        current.display_balance();
        current.withdraw(2500);
        current.display_balance();
        current.withdraw(1000);

    }
    
}

