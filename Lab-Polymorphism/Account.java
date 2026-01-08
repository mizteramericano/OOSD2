
public class Account
{
    protected double balance; //เงินในบัญชี
    protected String accNo;
    
    public Account(String accNo,double balance){
        this.accNo = accNo;
        this.balance = balance;
    }
    
      // ถอนเงิน
    public void withdraw(double amount) {
        if(amount <= balance){ //ถอนได้ก็ต่อเมื่อ เงินที่จะถอน น้อยกว่า หรือ เท่ากับ เงินในบัญชีที่มีอยู่
            balance = balance - amount;
            System.out.println("ถอนเงินไป : " + amount + " บาท " + "ยอดเงินหลังถอน = " + balance);
            return;
        } else if (amount > balance){
             System.out.println("ยอดเงินไม่เพียงพอ");
             return;
        }
    }
}
