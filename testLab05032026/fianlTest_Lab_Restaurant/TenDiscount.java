class TenDiscount implements DiscountStrategy
{
   public double discount(double totalCost){
       System.out.println("ลด 10 บาท  เหลือ : " + (totalCost - 10) + "บาท");
        return totalCost - 10 ;
    }
}
