package web.model;


import org.springframework.stereotype.Component;


public class Car {

    private String brand;
    private int price;
    private int year;

    public Car() {
    }

    public Car(String brand, int price, int year) {
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
