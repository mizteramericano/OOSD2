class TaxCalculator
{
    private TaxStrategy strategy;
    
    public void setStrategy(TaxStrategy strategy){
        this.strategy = strategy;
    }
    
    public double taxCalculate(double price){
        if(strategy == null){
            System.out.println("ไม่มีประเภทนี้");
        }
        return strategy.taxCalculate(price);
    }
}
