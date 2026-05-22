package Question1;

public class Car extends Vehicle{
    int days;

    public Car(String brand, int rentalPrice,int days) {
        super(brand, rentalPrice);
        this.days=days;
    }

    @Override
    public int calculateRentalCost(int days) {

        return getRentalPrice()*days;
    }
}

