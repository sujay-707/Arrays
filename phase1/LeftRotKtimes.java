public class LeftRotKtimes {
    public static void reverseArr(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        int k = 3;
        int n = arr.length;

        k = k % n;

        reverseArr(arr, 0, k - 1);
        reverseArr(arr, k, n - 1);
        reverseArr(arr, 0, n - 1);

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
