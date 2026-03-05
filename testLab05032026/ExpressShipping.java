class ExpressShipping implements ShippingStrategy
{

    public double calculate(double weightKg){
        double cost = 80 + (weightKg * 15);
        System.out.println("ExpressShipping : " + cost + " บาท");
        return cost;
    }
}
