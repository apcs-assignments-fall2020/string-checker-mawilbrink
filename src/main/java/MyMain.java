import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int length = str.length();
        int count = 0;

        for (int i = 0; i < length; i++){
            if ((str.charAt(i)) == ('a')){
                count += 1;
            }
            else if ((str.charAt(i)) == ('b')){
                count += 1;
            }
            else if ((str.charAt(i)) == ('c')){
                count += 1;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String newstr = str.toLowerCase();
        int the = newstr.indexOf("the");
        if (the == -1){
            return false;
        }
        else{
            return true;
        }  
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int length = str.length();
        String palindrome = "";

        for (int i = length -1; i > -1; i--){
            palindrome += str.charAt(i);
        }

        if (palindrome.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a string:");
        String input = scan.nextLine();

        System.out.println("Your string contains " + countABC(input) + " a's, b's, or c's.");

        if (containsThe(input)){
            System.out.println("Your string DOES contain the");
        }
        else{
            System.out.println("Your string DOES NOT contain the");
        }

        if (isPalindrome(input)){
            System.out.println("Your string IS a palindrome");
        }
        else{
            System.out.println("Your string IS NOT a palindrome");
        }


        
    }
}
