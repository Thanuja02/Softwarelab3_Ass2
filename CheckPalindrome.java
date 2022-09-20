import java.util.*;  

class CheckPalindrome {

    public native boolean checkPalindromeNative(String k);
    static {
        System.loadLibrary("CheckPalindrome");
    }
    public static void main(String[] args){
        CheckPalindrome checker = new CheckPalindrome();
        System.out.println("Enter a String : ");
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        sc.close();
        if(checker.checkPalindromeNative(k)==true){
            System.out.println("Is a Palindrome");
        }
        else {
            System.out.println(" Not a Palindrome");
        }
    }
}
