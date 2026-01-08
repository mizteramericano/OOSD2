public class SavingsAccount extends Account //บัญชีออมทรัพย์
{
    // ฟิลด์เฉพาะ คือต้องมีดอกเบี้ย
    private double interestRate; // ดอกเบี้ย
    
    public SavingsAccount(String accNo,double balance ,double interestRate){
        super(accNo,balance);
        this.interestRate = interestRate;
    }
    
    //override method class พ่อ คือ Account
    @Override
    public void withdraw(double amount) {
        System.out.println("กำลังถอนเงิน ....");
        // เงินฝาก  ต้องมากกว่า 0 และ เงินในบัญชีหักกกับเงินฝากแล้ว มีคงเหลือมากกว่าหรือเท่ากับ 50 บาท (ถอนได้)
        if(amount > 0 && (balance - amount) >= 50 ){
            super.withdraw(amount);
        }else{ //ถอนไม่ได้
            System.out.println("ถอนเงินไม่สำเร็จ" );
        }
    }
    
    // method เฉพาะของ SavingsAccount
    public void interrest(){
        double in = balance * (interestRate / 100);
        balance += in;
        System.out.println("คำนวนดอกเบี้ย :  " + in + " บาท (รวมในยอดเงินแล้ว)" );
    }
    
    
}
