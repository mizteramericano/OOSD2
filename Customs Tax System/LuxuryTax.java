class LuxuryTax implements TaxStrategy
{
    public double taxCalculate(double price){
        return (price * 0.3) + 500; 
    }
}
