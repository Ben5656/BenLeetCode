package src;

public class PalindromeNumber {
    public boolean isPalindrome(int x) { 
        String regular = Integer.toString(x);
        if(regular.equals(new StringBuffer(regular).reverse().toString())) return true;
        return false;
    }
}
