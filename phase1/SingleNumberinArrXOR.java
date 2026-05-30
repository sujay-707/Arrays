public class SingleNumberinArrXOR {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 6, 4, 2 };
        int n = arr.length;

        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(xor);

    }
}
