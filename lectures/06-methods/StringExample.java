public class StringExample {
    public static void main(String[] args) {
        String message = greet(); // return string
        System.out.println(message);
        String personalized = myGreet("David");
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        return "Welcome" + name;
    }

    static String greet() {
        return "How are you!";
    }

}