class PremiumBuffet implements BuffetStrategy
{
    public double calculatePrice(int customerCount){
        double serviceCharge = (customerCount * 799) * 0.1;
        return ((customerCount * 799) + serviceCharge) - 50;
    }
}
