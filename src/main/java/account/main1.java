package account;

public class main1 {
    public static void main(String[] args) {
        Account myAcc = new Account(1, "Graduate", 1000);
        myAcc.dispAccountDetails();
        myAcc.deposit(1000);
        myAcc.dispAccountDetails();
        myAcc.withdraw(1500);
        myAcc.dispAccountDetails();
    }

}
