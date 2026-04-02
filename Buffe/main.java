public class main
{
    public static void main(String[] args){
        Cashier c = new Cashier();
        
        int  cus1 = 3;
        int cus2 = 2;
    
        System.out.println("---------- Strategy ----------");
        c.setStrategy(new StandardBuffet());
        //c.calculatePrice(cus1);
        System.out.println("StandardBuffet : " + c.calculatePrice(cus1) + " บาท");
        
        c.setStrategy(new PremiumBuffet());
        System.out.println("PremiumBuffet : " + c.calculatePrice(cus2) + " บาท");
        
        c.setStrategy(new EconomyBuffet());
        System.out.println("EconomyBuffet : " + c.calculatePrice(1) + " บาท");
    
        System.out.println("---------- Factory ----------");
        c.setStrategy(BuffetFactory.createPackage("Standard"));
        System.out.println("StandardBuffet : " + c.calculatePrice(cus1) + " บาท");
        
        c.setStrategy(BuffetFactory.createPackage("Premium"));
        System.out.println("PremiumBuffet : " + c.calculatePrice(cus2) + " บาท");
        
        c.setStrategy(BuffetFactory.createPackage("Economy"));
        System.out.println("EconomyBuffet : " + c.calculatePrice(1) + " บาท");
        
        System.out.println("---------- ---------- ---------- ----------");
    
    }
}
