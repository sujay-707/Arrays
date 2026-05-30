public class RemoveDuplicatesInSorted {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,5,7};
        int n = arr.length;

        int pos = 0;

        for(int i=1;i<n;i++)
        {
            if(arr[i] != arr[pos])
            {
                pos++;
                arr[pos] = arr[i];
            }
        }

        System.out.println(pos + 1);

        for(int i=0;i<=pos;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
