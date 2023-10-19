import java.util.Scanner;

public class pangramString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int n = str.length();
        int freq[] = new int[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = 0;

        }
        for (int i = 0; i < n; i++) {

            if (str.charAt(i) != 'a') {
                freq[str.charAt(i) - 'a']++;

            }

            int temp = 0;
            for (i = 0; i < 26; i++) {
                if (freq[i] == 0) {

                    temp = 1;
                    break;

                }
            }
            if (temp == 1)

            {
                System.out.println("The string is  not a pangram");

            } else {

                System.out.println("The string is a pangram");
            }
        }
    }
}
