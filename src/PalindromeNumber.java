public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 ) return false;

        StringBuffer str = new StringBuffer(String.valueOf(x));

        Double reversed = Double.valueOf(str.reverse().toString());

        return x == reversed;
    }


    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
    }
}


