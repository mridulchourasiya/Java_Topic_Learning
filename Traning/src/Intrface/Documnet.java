package Intrface;

public class Documnet implements Printable{
    private String text;

    public Documnet(String text){
        this.text = text;
    }

    @Override
    public  void print(){
        System.out.println("Documnet Text: "+ text);
    }
}
