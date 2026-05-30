public class Secondlargest {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 1, 3, 10 };
        int n = arr.length;

        int lar = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > lar) {
                seclar = lar;
                lar = arr[i];
            } else if (arr[i] > seclar && arr[i] < lar) {
                seclar = arr[i];
            }
        }

        System.out.println(lar);
        System.out.println(seclar);
    }
}