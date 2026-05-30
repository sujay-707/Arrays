public class MisssingNumFrom1toN {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8};
        int n =arr.length+1;

        int s = 0;
        for(int i=0;i<arr.length;i++)
        {
            s= s + arr[i];
        }

        int es = n * (n+1) /2;

        System.out.println(s);
        System.out.println(es);

        int missNo = es - s;
        System.out.println(missNo);

    }
}
