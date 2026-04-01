class ElectronicsTax implements TaxStrategy
{
    public double taxCalculate(double price){
        if(price <= 5000){
            return price * 0.05;
        } else {
            return price * 0.07;
        }
    }   
}
