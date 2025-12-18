
public class MainBankAccount
{
    public static void main(String[] args) {
    
        BankAccount ba = new BankAccount("123", "Fong" , 100.00);
        
        // ทดสอบฝากเงิน
        ba.deposit(101); // ต้องได้ 110 บาท 201
        // ทดสอบถอนเงิน
        ba.withdraw(500); // 90 บาท
        // แสดงข้อมูลบัญชี
        ba.printInfo();
        
        
    
    
    }
}
