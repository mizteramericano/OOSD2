public class main
{
    public static void main(String[] asrgs){
        double price = 1000;
        DiscountCalculator d = new DiscountCalculator();
        
        d.setStrategy(new NonDiscount()); // ไม่ลดราคา
        d.discountFee(price);
        
        d.setStrategy(new HalfDiscount()); // ลด 50 บาท
        d.discountFee(price);
        
        d.setStrategy(new TenDiscount()); // ลด 10 บาท
        d.discountFee(price);
    }
}
