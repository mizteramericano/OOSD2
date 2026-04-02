class Cashier
{
    private BuffetStrategy strategy;
    
    public void setStrategy(BuffetStrategy strategy){
        this.strategy = strategy;
    }
    
    public double calculatePrice(int customerCount){
        if(strategy == null){
            System.out.println("ไม่มีประเภทนี้");
            return 0;
        }      
        return strategy.calculatePrice(customerCount);
    }
}
