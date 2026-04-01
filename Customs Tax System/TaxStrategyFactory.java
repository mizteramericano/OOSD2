class TaxStrategyFactory
{
    public static TaxStrategy createTaxStrategy(String s){
        if(s.equalsIgnoreCase("GENERAL")){
            //System.out.println("GENERAL : " + new GeneralTax());
            return new GeneralTax();
        } else if(s.equalsIgnoreCase("LUXURY")){
            //System.out.println("GENERAL : " + new LuxuryTax());
            return new LuxuryTax();
        } else if(s.equalsIgnoreCase("ELECTRONICS")){
            //System.out.println("GENERAL : " + new ElectronicsTax());
            return new ElectronicsTax();
        }
        
        return null;
    
    } 
}
