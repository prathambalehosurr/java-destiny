import java.util.HashSet;

public class RemoveDuplicate {

    public static String removeDuplicates(String str) {

        HashSet<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "java to java";

        System.out.println("Original String : " + str);
        System.out.println("After Removing Duplicates : " + removeDuplicates(str));
    }
}