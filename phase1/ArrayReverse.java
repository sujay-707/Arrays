public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 8, 7 };
        int n = arr.length;

        int l = 0;
        int r = n - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
