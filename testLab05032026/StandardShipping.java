class StandardShipping implements ShippingStrategy {
    
    public double calculate(double weightKg){
        double cost = 40 + (weightKg * 10);
        System.out.println("StandardShipping : " + cost + " บาท");
        return cost;
    }
    
    
    
}

    

