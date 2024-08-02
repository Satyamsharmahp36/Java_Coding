package Encapsulation;


class Account{
    private int balance=0;
    private int add;

    void checkBalance(String name){
        if(name=="Satyam"){
            System.out.println(this.balance);
        }
        else{
            System.out.println("You are not satyam");
        }
    }
    void deposit(int amount){
        if(amount>0){
            this.balance += amount;
        }
        else{
            System.out.println("Money Can't be debeted");
        }

    }


}

public class Encap {
    public static void main(String[] args) {
        Account a = new Account();
        a.checkBalance("Satyam");
        a.deposit(20);
        a.checkBalance("Satyam");
        a.deposit(-10);
    }
}
