package oop.src.com.dinesh.staticExample;

public class Main {
    public static void main(String[] args) {
        // object of human class
        Human obj1 =  new Human(22, "Dinesh", 100000, false);
        Human obj2 =  new Human(26, "Suman", 50000, true);
        Human obj3 =  new Human(26, "Sumi", 70000, true);
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);


        // object of Main
        Main funObj =  new Main();
        funObj.fun2();


       //  greeting(); // Non-static method 'greeting()' cannot be referenced from a static context
    }

    // we know that something which is not static, belongs to an object
    void greeting(){
        // this is dependent upon objects
        System.out.println("hello world");
        fun();//  but we can use static method inside non-static method
    }

    void  fun2(){
       // when greeting is called inside fun2 , we know at the end fun2 will be called inside main function directly or indirectly
       // I actually need object to run so no worry fun2 is also need object to run which will get inside main func()
        greeting();
    }
    static void fun(){
        // this is not dependent upon objects
        // greeting(); // non-static method 'greeting()' cannot be referenced from a static context // you can't use this because it requires instance
        // if you want to run greeting() make yourself object and run


        // but there is a way
        // make it static or get an object
        Main obj = new Main(); // now it is getting instance
        obj.greeting();
    }


}
