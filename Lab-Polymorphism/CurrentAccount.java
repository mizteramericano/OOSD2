public class CurrentAccount extends Account //กระแสรายวัน
{
   //จุดเด่นคือ balance(ยอดเงินในบัญชี)) ติดลบ ได้
    private double overdraftLimit; // เพดานเงินสูงสุดที่ติดได้
    
    public CurrentAccount(String accNo,double balance,double overdraftLimit ){
         super(accNo,balance);
         this.overdraftLimit = overdraftLimit;
         
    }
    
    // override method พ่อ
    @Override
    public void withdraw(double amount) {
        System.out.println("กำลังถอนเงิน ....");
        // เงินหลังถอน(balance) ต้องไม่ติดลบเกินวง(overdraftLimit)เงินที่ตั้งไว้
        if(amount > 0 && (balance - amount) >= -overdraftLimit ){
            //balance -= amount ;
            //System.out.println("ถอนเงินจำนวน  :  " + amount + "  บาท สำเร็จ");
            super.withdraw(amount);
        }else{ //ถอนไม่ได้
            System.out.println("ถอนเงินไม่สำเร็จ" );
        }
    }
}
