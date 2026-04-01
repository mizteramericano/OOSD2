class CartCalculator
{
    private DiscountStrategy strategy;
    public void setStrategy(DiscountStrategy strategy){
        this.strategy = strategy;
    }
    
    public double calculateTotal(double amount){
        if(strategy == null){
            System.out.println("ไม่มีสมาชิกนี้");
        }
        return strategy.calculate(amount);
    }
}
