package Question1;

public class Vehicle {
    private String brand;
   private int rentalPrice;


    public Vehicle(String brand,int rentalPrice){
        this.brand=brand;
        this.rentalPrice=rentalPrice;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    public int calculateRentalCost(int days){
        return rentalPrice*days;
    }
    public void display(){
        System.out.println(" brand: "+brand + " rental price:"+rentalPrice);
    }
}
