package Intrface;

public class Main {
    public static void main(String[] args) {
        Printable doc = new Documnet("This Documnet. ");
        Printable img = new Image(1920, 1080);


        doc.print();
        img.print();
    }
}
