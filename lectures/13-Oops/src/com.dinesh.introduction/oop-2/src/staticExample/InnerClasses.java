package staticExample;

/*
 outside class cannot be static
static public class InnerClasses {
    // inner class can be static
    static class Test{

    }
}

static class A {} // outside class cannot be static
*/


public class InnerClasses{
//    class Test{
//        String name;
//    }

//    what if I make class Test as static


    static class  Test{
        String name;

        public Test(String name) {
        this.name = name;
        }
    }

    public static void main(String[] args) {
        // cannot be referenced as this is static
        Test a = new Test("Kuala");
        Test b = new Test("RaHul");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}


// when I am putting class Test inside Innerclass and creating object in main function it is giving error because now it is non-static class inside inner class
// but if i am using class Test outside it do not depend upon the object of Inner class
// when we print here it is giving rahul and kunal two different result that means static rules fails here