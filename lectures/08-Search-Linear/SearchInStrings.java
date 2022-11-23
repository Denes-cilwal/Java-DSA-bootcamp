 public class SearchInStrings {
        public static void main(String[] args) {
            String name = "Kuala";
            char target = 'u';
            System.out.println(search(name, target));
        }

        static boolean search2(String str, char target) {
            if (str.length() == 0) {
                return false;
            }
            // for every element in array check logic
            // for every char in array check
            // first convert str to array
            for (char ch :
                    str.toCharArray()) {
                // to loop over string we just convert into array - char Array created
                if (ch == target) {
                    return true;
                }

            }
            return false;
        }

        static boolean search(String str, char target) {
            if (str.length() == 0) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    return true;
                }
            }
            return false;
        }
    }