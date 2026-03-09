class HalfDiscount implements DiscountStrategy
{
    public double discount(double totalCost){
        System.out.println("ลด 50 บาท เหลือ : " + (totalCost - 50) + "บาท");
        return totalCost - 50 ;
    }
}
