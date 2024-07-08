package Intrface;

public class Image implements  Printable{
    private  int width;
    private int height;

    public  Image(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public  void  print(){
        System.out.println("Image Width: "+ width + ", Height: "+ height);
    }
}
