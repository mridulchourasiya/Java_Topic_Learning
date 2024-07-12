package HomeWorkModule.july04;

public class Mobile {
    private int cameraPixel;
    private int batteryMAh;
    private String displayType;
    private double price;

    public Mobile() {
        this.cameraPixel = 108;
        this.batteryMAh = 5000;
        this.displayType = "Amoled";
        this.price = 15000;
    }

    public Mobile(int cameraPixel, int batteryMAh, String displayType, double price) {
        this.cameraPixel = cameraPixel;
        this.batteryMAh = batteryMAh;
        this.displayType = displayType;
        this.price = price;
    }

    public void installApp() {
        System.out.println("App is installing...");
    }

    public int calculation(int a, int b, int c) {
        return a + b + c;
    }
    public void setCameraPixel(int i) {
    }
    public void setBatteryMAh(int i) {
    }
    public void setDisplayType(String string) {
    }
    public void setPrice(int i) {
    }




}
