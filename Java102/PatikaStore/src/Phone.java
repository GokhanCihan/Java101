public class Phone extends Product{
    private int battery;
    private String color;

    public int getBattery() {
        return battery;
    }

    public String getColor() {
        return color;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "|\t" + getId() + "\t|" +
                "|\t" + getBrand() + "\t|" +
                "|\t" + getName() + "\t|" +
                "|\t" + getColor() + "\t|" +
                "|\t" + getPrice() + "\t|" +
                "|\t" + getStocks() + "\t|" +
                "|\t" + getDiscount() + "\t|" +
                "|\t" + getMemory() + "\t|" +
                "|\t" + getScreenSize() + "\t|";
    }
}
