public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int n = arr.length;

        int key = 6;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Key found at index= " + i);
                return;
            }
        }
        System.out.println("Key Not found");
    }
}
