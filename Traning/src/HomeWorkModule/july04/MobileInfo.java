package HomeWorkModule.july04;

public class MobileInfo {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.setCameraPixel(108);
        mobile.setBatteryMAh(5000);
        mobile.setDisplayType("AMOLED");
        mobile.setPrice(15000);
        mobile.installApp();
        System.out.println("Sum: " + mobile.calculation(10, 20,30));

    }
}
