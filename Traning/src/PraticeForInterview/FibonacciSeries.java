package PraticeForInterview;

public class FibonacciSeries implements Runnable {
    private  int num;

    public  FibonacciSeries(int num){
        this.num = num;
    }


    @Override
    public void  run(){
        System.out.println(Thread.currentThread().getName() + ": "+ num);
    }


    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++ ){
            Thread thread = new Thread(new FibonacciSeries(i));
            thread.start();
        }
    }
}
