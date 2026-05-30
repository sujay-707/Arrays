public class MaxConsecutiveOnes{
    public static void main(String[] args) {
        int arr[] = {1,1,3,1,1,1,2,1,1,1,1,1};

        int c = 0;
        int mc = 0;
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            if(arr[i] == 1)
            {
                c++;
                mc = Math.max(mc , c);
            }else{
                c = 0;
            }
        }

        // System.out.println(c);
        System.out.println(mc);
    }
}