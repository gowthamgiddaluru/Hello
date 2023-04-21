public class PalindromeNumber{
    public static void checkPalindrome(int n) {
        int value, addition = 0, temporary;
        temporary = n;
        while( n > 0 ) {
            value = n % 10;
            addition = (addition*10) + value;
            n = n / 10;
        }
        if(temporary == addition){
            System.out.println("the given number is palindrome.");
        }else{
            System.out.println("the given number is not palindrome.");
        }
    }
    public static void main(String [] args) {
        PalindromeNumber myObj = new PalindromeNumber();
        int num = 7007;
        myObj.checkPalindrome(num);
        int num1 = 1234;
        myObj.checkPalindrome(num1);
    }
}