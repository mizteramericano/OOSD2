class PickupShipping implements ShippingStrategy
{
    public double calculate(double weightKg){
        double cost = 0;
        System.out.println("PickupShipping : " + cost + " บาท");
        return cost;
    }
}
