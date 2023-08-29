package oop.src.com.dinesh.Interface.paymentInterface;

public class CheckoutSystem {

    // checkout System
    public void checkout(PaymentMethod method, double amount) {
        if (method.authorizePayment(amount)) {
            // if it is authorized Payment , process payment
            method.processPayment(amount);
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed!");
        }
    }

    public static void main(String[] args) {
        CheckoutSystem checkout = new CheckoutSystem();
        PaymentMethod creditCard = new CreditCard();
        // the object defines dynamically which method to call in the runtime and type defines what to call
        checkout.checkout(creditCard, 100.0);


        // what to access in compile time vs which to access in runtime
        PaymentMethod paypal = new PayPal();
        checkout.checkout(paypal, 150.0);
    }
}

/*

PaymentMethod payment = new CreditCard(); why this
CreditCard() payment = new CreditCard(); why not this

The first approach PaymentMethod payment = new CreditCard();) offers flexibility. It allows you to swap out different payment methods when necessary without much hassle.
The second approach CreditCard payment = new CreditCard();) is definitive. It's great when you're certain about the method, but it might restrict the ease of change later on.

 */