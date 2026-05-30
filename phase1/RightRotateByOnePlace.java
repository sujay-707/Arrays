public class RightRotateByOnePlace {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int n = arr.length;

        int temp = arr[n-1];

        for(int i=n-2;i>=0;i--)
        {
            arr[i+1] = arr[i];
        }

        arr[0] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }
}
