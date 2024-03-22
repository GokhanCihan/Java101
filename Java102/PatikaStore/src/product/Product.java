package product;

public abstract class Product {
    private String brand;
    private String name;
    private int price;
    private int stocks;
    private int discount;
    private int memory;
    private int ram;
    private double screenSize;

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getStocks() {
        return stocks;
    }

    public int getDiscount() {
        return discount;
    }

    public int getMemory() {
        return memory;
    }

    public int getRam() {
        return ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getProductType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return this.name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
