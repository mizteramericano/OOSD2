public class mainA
{
    public static void main(String[] args){
        CartCalculator c = new CartCalculator();
        double price = 1000.0;
        
        RegularDiscount rb = new RegularDiscount();
        PremiumDiscount pb = new PremiumDiscount();
        VipDiscount vd = new VipDiscount();
        
        c.setStrategy(rb);
        System.out.println("RegularDiscount " + c.calculateTotal(price) + " บาท");
        
        c.setStrategy(pb);
        System.out.println("PremiumDiscount " + c.calculateTotal(price) + " บาท");
        
        c.setStrategy(vd);
        System.out.println("VipDiscount " + c.calculateTotal(price) + " บาท");
    }
    
}
