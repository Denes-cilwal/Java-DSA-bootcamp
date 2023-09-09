package oop.src.com.dinesh.Interface.paymentInterface;

public interface PaymentMethod {

    /*
       useCase-You are designing the system where various payment methods need to be supported like
       credit card , PayPal or bank transfer
    */

    /*
    Java, an interface is a reference type, similar to a class,
    that can contain only the declaration of methods, properties, and other abstractions,
    but not their implementation.
    They can be implemented by any class and
    then the implementing class would have to provide the specific implementation
    for the abstract methods in the interface.
     */

     /*
     the methods in interface are implicitly 'public' and 'abstract'
     You don't need to (and in fact cannot) use the abstract keyword in an interface method declaration. Similarly, fields in interfaces are implicitly public, static, and final
     is equivalent to
     public interface PaymentMethod {
        public abstract boolean authorizePayment(double amount);
       public abstract void processPayment(double amount);
      }
    shorter version is more idiomatic in Java
     */

     // by default abstract
       boolean authorizePayment(double amount);
        void processPayment(double amount);

}

/*
    Implementing the Interface
    Now, different payment methods will implement this interface and provide their own logic:
*/