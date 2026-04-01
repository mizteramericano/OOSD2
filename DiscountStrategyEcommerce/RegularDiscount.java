
class RegularDiscount implements DiscountStrategy
{
    public double calculate(double totalAmount){
        return totalAmount * 0.05; //ส่วนลด ยังไม่ใช้เงินสุทธ
    }
}
