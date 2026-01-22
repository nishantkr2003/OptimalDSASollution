class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        // sort the concatenated array
        Arrays.sort(c);

        int len = c.length;

        // if length of array is even
        if (len % 2 == 0)
            return (c[len / 2] + c[len / 2 - 1]) / 2.0;

        // if length of array is odd
        else
            return c[len / 2];
    }
}