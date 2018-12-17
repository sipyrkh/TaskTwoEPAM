public class BackNumber {
    public static int reverse(int n){
        String str = String.valueOf(n);
        String reverseStr = new StringBuffer(str).reverse().toString();
        int reverseInt = Integer.parseInt(reverseStr);
        return reverseInt;
    }
}
