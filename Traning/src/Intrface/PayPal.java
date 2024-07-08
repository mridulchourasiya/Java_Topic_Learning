package Intrface;

public class PayPal implements  PaymentMethod{
    private  String email;


    public  PayPal(String email){
        this.email = email;
    }
    @Override
    public  void pay(){
        System.out.println("Payment made using PayPal. ");
    }

    @Override
    public String getPaymentDetails(){
        return "Paypal Email: "+ email;
    }
}
