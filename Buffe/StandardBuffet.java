class StandardBuffet implements BuffetStrategy
{
    public double calculatePrice(int customerCount){
        double serviceCharge = (customerCount * 499) * 0.1;
        return (customerCount * 499) + serviceCharge ;
    }
}
