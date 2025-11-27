class Solution {
    public int kthFactor(int n, int k) {
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {   // i is a factor
            k--;
            if (k == 0) return i;
        }
    }
    return -1;
}

}