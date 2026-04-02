class BuffetFactory
{
    public static BuffetStrategy createPackage(String type){
        if(type.equalsIgnoreCase("Economy")){
            return new  EconomyBuffet();
        } else if (type.equalsIgnoreCase("Standard")){
            return new  StandardBuffet();
        } else if (type.equalsIgnoreCase("Premium")){
            return new  PremiumBuffet();
        } else {
            System.out.println("ไม่พบประเภทนี้");
        }
        
        return null;
    }
}
