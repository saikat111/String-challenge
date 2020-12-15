import java.util.*;

class Main {
    static int MAX = 256;
    public static String StringChallenge(String str1, String str2) {
        int[] count = new int[MAX];
        char []str3 = str1.toCharArray();
        for (int i = 0; i < str3.length; i++)
            count[str3[i]]++;
        char []str4 = str2.toCharArray();
        for (int i = 0; i < str4.length; i++) {
            if (count[str4[i]] == 0)
                return "false";
            count[str4[i]]--;
        }
        return "true";
    }

    public static void main (String[] args) {
      //  String str1, str2;
        // keep this function call here
    /*    Scanner s = new Scanner(System.in);
        str1 = s.nextLine();
        str2  =s.nextLine();
        System.out.println(StringChallenge(str1, str2));*/
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));

    }
}