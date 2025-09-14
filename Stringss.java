public class Stringss {
    
    public static void main(String[] args) {
        //Basic syntax
        String str = "Hello";

        //To display a specifc index of string
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(2));

        //Character Array as string
        char[] charArr = {'L','i','O','N'};
        System.out.println(charArr);

        String str2 = new String("Hello");
        System.out.println(str == str2); // == comapres the instances not content

        System.out.println(str.equals(str2)); // here content is compared

        //StringBuffer and some methods
        StringBuffer sb = new StringBuffer("HELLO");
        System.out.println(sb);
        
        sb.append(" World");
        System.out.println(sb);

        sb.insert(0, "W");
        sb.insert(6, "H");
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.delete(1, 8);
        System.out.println(sb);

        //Pretty printing
        float a = 45.639f;
        System.out.printf("Th formatted number is %.2f", a);
        System.out.println();
        System.out.printf("my name is %s and i'm %s", "Tony Stark", "Iron Man");
        System.out.println();

        //Printing aplhabets, storing them in a string
        String st = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            st = st + " " + ch;
        }
        System.out.println(st);
        


        //String Builder
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.toString().indexOf('t'));
        

        //String is palindrome or not
        String word = "racecar";
        System.out.println(isPalindrome(word));
    }

    static boolean isPalindrome (String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);                 //1st index
            char end = str.charAt(str.length() - 1-i);    //last index

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
