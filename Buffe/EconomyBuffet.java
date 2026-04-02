class EconomyBuffet implements BuffetStrategy
{
    public double calculatePrice(int customerCount){
        return customerCount * 299;
    }
    
    
}
