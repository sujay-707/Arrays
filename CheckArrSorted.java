public class CheckArrSorted {
    public static void main(String[] args) {
        int arr[] = {1,6,4,5,6};
        int n = arr.length;

        boolean sorted = true;

        for(int i=0;i<n-1;i++)
        {
            if(arr[i] > arr[i + 1])
            {
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}