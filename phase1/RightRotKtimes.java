public class RightRotKtimes {

    public static void Revz(int arr[], int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 6, 8 };
        int n = arr.length;

        int k = 2;

        k = k % n;

        Revz(arr, 0, n - k - 1);
        Revz(arr, n - k, n - 1);
        Revz(arr, 0, n - 1);

        System.out.println();

        for (int i= 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
