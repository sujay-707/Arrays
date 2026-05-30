public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 1, 0, 1, 2, 0 };
        int n = arr.length;

        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
