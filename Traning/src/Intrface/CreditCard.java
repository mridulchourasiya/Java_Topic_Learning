package Intrface;

public class CreditCard implements  PaymentMethod {
    private  String cardNumber ;
    private  String expirationDate;

    public  CreditCard (String cardNumber, String expirationDate){
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public  void  pay(){
        System.out.println("Payment made using Credit Card. ");
    }

    @Override
    public String getPaymentDetails(){
        return  "Ceadit Card Number: "+ cardNumber + ", Expiration Date: "+ expirationDate;
    }


}
