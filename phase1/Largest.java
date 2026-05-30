public class Largest{
    public static void main(String[] args) {
        int arr[] = {5,4,8,1,0,6};
        int n = arr.length;

        for(int i=0; i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

        int lar = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i] > lar)
            {
                lar = arr[i];
            }
        }

        System.out.println();
        System.out.println(lar);
    }
}