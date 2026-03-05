public class mainA
{
    public static void main(String[] asrgs){
        
        double w = 3.0;
        ShippingCalculator s = new ShippingCalculator();
        
        s.setStrategy(new StandardShipping());
        s.calculateFee(w);
        
        s.setStrategy(new ExpressShipping());
        s.calculateFee(w);
        
        s.setStrategy(new PickupShipping());
        s.calculateFee(w);
        
        
        
        
    }
}
