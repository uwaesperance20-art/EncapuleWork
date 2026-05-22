package Question1;

public class Bike extends Vehicle {
    int days;
    public Bike(String brand, int rentalPrice,int days) {
        super(brand, rentalPrice);
        this.days=days;
    }

    @Override
    public int calculateRentalCost(int days) {
        return (getRentalPrice()*days)-10;
    }
}
