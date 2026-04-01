class VipDiscount implements DiscountStrategy
{
    public double calculate(double totalAmount){
        return (totalAmount * 0.3); //ส่วนลด ยังไม่ใช้เงินสุทธ
    }
}
