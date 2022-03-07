package account;

public class Account {
    int accNo = -1;
    String accountType = "";
    int accBal = 0;

    public Account(int accNo, String accountType, int accBal){
        setAccNo(accNo);
        setAccountType(accountType);
        setAccBal(accBal);
    }
    public Account(){}

    public void setAccountDetails(int accNo, String accountType, int accBal){
        setAccNo(accNo);
        setAccountType(accountType);
        setAccBal(accBal);
    }

    public void deposit(int depositAmount){
        setAccBal(getAccBal()+depositAmount);
    }
    public void withdraw(int withdrawAmount){
        setAccBal(getAccBal()-withdrawAmount);
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccBal() {
        return accBal;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accountType='" + accountType + '\'' +
                ", accBal=" + accBal +
                '}';
    }

    public void dispAccountDetails(){
        System.out.print(this.toString() +'\n');
    }
}
