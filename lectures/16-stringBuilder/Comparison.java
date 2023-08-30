public class Comparision {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "Kunal";

        // == method
        System.out.println(a == b); // false


        // multiple object with same value
        String name1 = new String("tech");
        String name2 = new String("tech");
        System.out.println(name1 == name2); // false // diff objects // it cares if both object pointing to same location or not

        // but equals only considers value check not location
        System.out.println(name1.equals(name2)); // true
        // but equals also give false if diff value

    }
}
