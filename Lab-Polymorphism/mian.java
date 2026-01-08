public class mian
{
    public static void main(String[] args) {
        Account[] acc = new Account[3] ;
        
        acc[0] = new SavingsAccount("S001",1000.0,1.5);
        acc[1] = new CurrentAccount("C001" ,500.0 , 2000.0);
        acc[2] = new FixedDepositAccount("F001",5000.0);
        
        System.out.println("------ กำลังถอนเงินจำนวน 200.0 บาท -------------");
        for(Account a : acc)
        {
            if (a != null) {
                System.out.println("เลขที่บัญชี : " + a.accNo);
                a.withdraw(200.0);
            }
        }
        System.out.println("ทำรายการเสร็จสิ้น");
    }
}
