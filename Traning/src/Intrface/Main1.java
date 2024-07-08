package Intrface;

public class Main1 {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard("1231-1212-12133-111", "12/25");
        PaymentMethod payPal = new PayPal("Uesr@123.gmail.com");

        creditCard.pay();
        System.out.println(creditCard.getPaymentDetails());

        payPal.pay();
        System.out.println(payPal.getPaymentDetails());
    }
}
