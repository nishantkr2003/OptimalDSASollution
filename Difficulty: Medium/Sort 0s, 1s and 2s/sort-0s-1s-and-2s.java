class Solution {
    public void sort012(int[] arr) {
        int zero = 0, one = 0, two = 0;

        for (int num : arr) {
            if (num == 0) zero++;
            else if (num == 1) one++;
            else two++;
        }

        int index = 0;

        for (int i = 0; i < zero; i++) {
            arr[index++] = 0;
        }
        for (int i = 0; i < one; i++) {
            arr[index++] = 1;
        }
        for (int i = 0; i < two; i++) {
            arr[index++] = 2;
        }
    }
}
