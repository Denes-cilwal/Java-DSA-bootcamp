package oop.src.com.dinesh.Interface.paymentInterface;

public class PayPal implements PaymentMethod {
    private String email;

    // Constructor and other methods...

    @Override
    public boolean authorizePayment(double amount) {
        // Logic to authorize payment using PayPal
        System.out.println("Payment authorized for PayPal");
        return true;
    }

    @Override
    public void processPayment(double amount) {
        // Logic to process the PayPal payment
        System.out.println("Payment processed for PayPal");
    }
}

/*
The private String email;
within the PayPal class represents the email address associated with a PayPal account.
When making transactions through PayPal, the email address is often used as an identifier for the account.

Encapsulation: By declaring the email field as private, the class is practicing encapsulation.
This means the email data is protected from direct modification from outside the class.
This ensures that only the methods within the PayPal class can interact with and modify the email field,
thereby maintaining data integrity.
 */

/*
When you declare a method in an interface in Java, it's implicitly public.
This means that any class that implements this interface is making a contract to provide a public implementation of those methods.
This contract ensures that the method will be accessible to any other class that interacts with objects of the implementing class through the interface.

Given this contract,
if you try to implement an interface method with a more restrictive access modifier, like private or protected,
the Java compiler will throw an error because it violates the contract established by the interface.

Let's break it down:

Interface Contract: An interface in Java provides a contract that any implementing class must follow.
The methods in an interface are implicitly public because they're intended to be implemented and then called by other classes.
It's a guarantee of certain behavior that any implementing class will provide.
Access Modifiers: When you implement an interface method in a class, you must ensure it has the appropriate access level,
which for interface methods is public.

Compilation Error: If you don't use public, you'll get a compilation error.
This error is the compiler's way of enforcing the contract that the interface sets out.

For example, if you have:

public interface PaymentMethod {
    boolean authorizePayment(double amount);
}
And you try to implement it as:


public class CreditCard implements PaymentMethod {

    // Incorrect! This will result in a compilation error
    boolean authorizePayment(double amount) {
        // Implementation details
        return true;
    }
}

The compiler will raise an error because the authorizePayment method in the
CreditCard class does not fulfill the contract of the PaymentMethod interface by being public.
You must correct it as:

java

public class CreditCard implements PaymentMethod {

    // Correct
    public boolean authorizePayment(double amount) {
        // Implementation details
        return true;
    }
}
In conclusion, when implementing interface methods in a class, you must declare them as public to honor the contract set by the interface.
 */