public class SmallestLetter {
//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'a';
      char   ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

    // Letter the wrap ar
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;
        // assume this array is in sorted order
        while (start <= end){
            // find middle element
            // int mid =  start + end / 2; // might exceed the range of array integer in java
            //  better way to find value
            int mid = start + (end-start) / 2;
            if (target < letters[mid]){
                end =  mid -1;
            } else {
                start = mid + 1;
            }
        }
        // return 0 index
        return  letters[start % letters.length];
        // if letter[start] == letters.length // return 0
    }
}