package ClassAndObject;

public class Mobile {
    private String mobile;
    private int pixel;
    private String price;
    private double batteryHealth;

    public Mobile(String mobile, int pixel, String price, double batteryHealth) {
        this.mobile = mobile;
        this.batteryHealth = batteryHealth;
        this.pixel = pixel;
        this.price = price;
    }

    public double getBatteryHealth() {
        return batteryHealth;
    }

    public void setBatteryHealth(double batteryHealth) {
        this.batteryHealth = batteryHealth;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void displayInfo() {
        System.out.println("Mobile: " + mobile);
        System.out.println("Price: " + price);
        System.out.println("Pixel: " + pixel);
        System.out.println("Battery Health: " + batteryHealth);
    }
}
