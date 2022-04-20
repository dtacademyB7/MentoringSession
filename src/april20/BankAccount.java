package april20;

public class BankAccount {


    private double balance;
    private String accountOwner;
    private long accountNo;
    private long routingNo;
    private String address;
    private String ssn;

    public BankAccount(double balance, String accountOwner, long accountNo, long routingNo, String address, String ssn) {
        this.balance = balance;
        this.accountOwner = accountOwner;
        this.accountNo = accountNo;
        this.routingNo = routingNo;
        this.address = address;
        this.ssn = ssn;
    }

    public BankAccount() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public long getRoutingNo() {
        return routingNo;
    }

    public void setRoutingNo(long routingNo) {
        this.routingNo = routingNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
