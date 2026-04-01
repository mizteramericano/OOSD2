public class mainA
{
    public static void main(String[] agrs){
        
        TaxCalculator tax = new TaxCalculator();
        double price = 5000;
        
        if(price < 0){
            System.out.println("คุณใส่ราคาผิด");
        }
        
        System.out.println("------Strategy----------");
        tax.setStrategy(new GeneralTax());
        System.out.println("GeneralTax : " + tax.taxCalculate(price));
        
        tax.setStrategy(new LuxuryTax());
        System.out.println("LuxuryTax : " + tax.taxCalculate(2000));
        
        tax.setStrategy(new ElectronicsTax());
        System.out.println("ElectronicsTax : " + tax.taxCalculate(7000));
        
        System.out.println("------Factory----------");
        TaxStrategy gen = TaxStrategyFactory.createTaxStrategy("GENERAL");
        tax.setStrategy(gen);
        System.out.println("GENERAL: " + tax.taxCalculate(7000));
        
        TaxStrategy lux = TaxStrategyFactory.createTaxStrategy("LUXURY");
        tax.setStrategy(lux);
        System.out.println("LUXURY: " + tax.taxCalculate(7000));
        
        TaxStrategy elec = TaxStrategyFactory.createTaxStrategy("ELECTRONICS");
        tax.setStrategy(elec);
        System.out.println("ELECTRONICS: " + tax.taxCalculate(7000));
    }
}
