class GeneralTax implements TaxStrategy
{
    public double taxCalculate(double price){
        return price * 0.1;  
    }
}
