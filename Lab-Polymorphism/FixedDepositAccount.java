
public class FixedDepositAccount extends Account //บัญชีเงินฝากประจำ
{
   // มีค่าธรรมเนียมในการ หัก เงิน เมื่อเราถอนก่อนกำหนด มีเรื่องระยะเวลาเข้ามาเกี่ยวข้องด้วย
   private boolean isMatured; //ฝากกี่เดือน
   private double penaltyRate;// ค่าปรับ

   public FixedDepositAccount(String accNo,double balance){
        super(accNo,balance);
        this.isMatured = false;
        this.penaltyRate = 2.0;
        
   }
   
   // override  method class พ่อมา
   @Override
   public void withdraw(double amount) {
        double totalCharge = amount;
        // ถ้ายังไม่ครบกำหนด  isMatured = false
        if(!isMatured) {
            double penalty = amount * (penaltyRate / 100); //ค่าปรับ หัก 2% จะได้ 0.02
            totalCharge = amount + penalty;
            System.out.println("ถอนก่อนกำหนด เสียค่าปรับ เป็นจำนวน : " + penalty + " บาท ");
        }
        if (balance >= totalCharge) {
            super.withdraw(totalCharge);
            System.out.println("ถอนเงินรวมค่าธรรมเนียมสำเร็จ ! ");
        } else {
            System.out.println("ยอดเงินไม่เพียงพอ");
        }
    }


}
