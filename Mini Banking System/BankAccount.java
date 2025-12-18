class BankAccount
{
    private String accountNumbe, ownerName;
    private double balance;
    
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumbe = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // method ฝากเงิน
    public void deposit(double amount) {
        if(amount > 0) { // ฝากเงินได้
            balance = balance +amount;
            System.out.println("ยอดเงินหลังเติม = " + balance);
            return;
        } else { 
            System.out.println("input ur money");
        }

    }

    // ถอนเงิน
    public void withdraw(double amount) {
        if(amount <= balance){ //ถอนได้ก็ต่อเมื่อ เงินที่จะถอน น้อยกว่า หรือ เท่ากับ เงินในบัญชีที่มีอยู่
            balance = balance - amount;
            System.out.println("ยอดเงินหลังถอน = " + balance);
            return;
        } else if (amount > balance){
             System.out.println("ยอดเงินไม่เพียงพอ");
             return;
        }
    }

    // คืนยอดเงินคงเหลือ
    public double getBalance() {
        return balance;
    }

    // display
    public void printInfo() {
        System.out.println("accountNumbe : " + accountNumbe + " ownerName : " + ownerName + " balance : " + balance);
    }

  
}
