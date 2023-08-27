 public class SearchInStrings {
        public static void main(String[] args) {
            // done
            String name = "Kuala";
            char target = 'u';
    Boolean result =  search(name, target);
            System.out.println(result);
        }

//        static boolean search2(String str, char target) {
//            if (str.length() == 0) {
//                return false;
//            }
//            // for every element in array check logic
//            // for every char in array check
//            // first convert str to character array
//            for (char ch :
//                    str.toCharArray()) {
//                // to loop over string we just convert into array - char Array created
//                if (ch == target) {
//                    return true;
//                }
//
//            }
//            return false;
//        }

        static boolean search(String str, char target) {
            if (str.length() == 0) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {

                // compares with ascii value
               int element = str.charAt(i);
                if (element == target) {
                    return true;
                }
            }
            return false;
        }
    }