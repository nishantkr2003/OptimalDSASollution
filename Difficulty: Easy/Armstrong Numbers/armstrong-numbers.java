// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;
        int digits = String.valueOf(n).length(); // number of digits
        
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        
        return sum == original;
    }
}
