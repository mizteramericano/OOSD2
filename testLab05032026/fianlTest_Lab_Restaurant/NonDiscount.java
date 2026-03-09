class NonDiscount implements DiscountStrategy
{
    public double discount(double totalCost){
        System.out.println("ไม่ลด : " + totalCost + "บาท");
        return totalCost;
    }
}
