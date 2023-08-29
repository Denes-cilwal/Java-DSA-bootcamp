package oop.src.com.dinesh.Interface.paymentInterface;

public class CreditCard implements PaymentMethod{

    @Override
    public boolean authorizePayment(double amount) {
        System.out.println("Payment authorized for credit card");
        return true;
    }


    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed for credit card");
    }
}
