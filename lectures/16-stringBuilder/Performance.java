public class Performance {
    // vimp for interview
    public static void main(String[] args) {
        String series =  "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i); // look at explicit type casting
            System.out.println(ch);
            series =  series + ch;
        }
        System.out.println(series);
    }


}
