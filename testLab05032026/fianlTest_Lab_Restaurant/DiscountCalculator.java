class DiscountCalculator
{
    private DiscountStrategy strategy;
    
    public void setStrategy(DiscountStrategy strategy){
        this.strategy = strategy;
    }
    
    public double discountFee(double totalCost){
        if(strategy == null){ //ไม่เจอวิธี
            System.out.println("ไม่พบรายการ");
        }
        
        return strategy.discount(totalCost);
    }
}
