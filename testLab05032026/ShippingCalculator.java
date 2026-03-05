class ShippingCalculator 
{
    private ShippingStrategy strategy; //ShippingStrategy 
    
    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }
    
    public double calculateFee(double weightKg) {
        if (strategy == null ){
            System.out.println("กรุ.ณาเลือกวิธีจัดส่ง");
        }
        return strategy.calculate(weightKg);
    }
    
}
