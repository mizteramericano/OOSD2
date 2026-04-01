class PremiumDiscount implements DiscountStrategy
{
    public double calculate(double totalAmount){
        return (totalAmount * 0.15 ) + 20; //ส่วนลด ยังไม่ใช้เงินสุทธ
    }
}
