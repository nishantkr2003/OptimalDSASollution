class Solution {

    static long inversionCount(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSort(arr, temp, 0, n - 1);
    }

    static long mergeSort(int[] arr, int[] temp, int l, int r) {
        long count = 0;

        if (l < r) {
            int mid = l + (r - l) / 2;

            count += mergeSort(arr, temp, l, mid);
            count += mergeSort(arr, temp, mid + 1, r);
            count += merge(arr, temp, l, mid, r);
        }

        return count;
    }

    static long merge(int[] arr, int[] temp, int l, int mid, int r) {

        int i = l;
        int j = mid + 1;
        int k = l;
        long count = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (i = l; i <= r; i++) {
            arr[i] = temp[i];
        }

        return count;
    }
}
