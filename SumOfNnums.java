public class SumOfNnums {
 public static void main(String[] args) {
    int n = 5;
    int sum =0;
    for(int i=0;i<=n;i++)
    {
        sum = sum + i;
    }
    System.out.println(sum);



    //forward Travesal 
    int arr[] = {1,2,3,4,5};
    int size = arr.length;

    for(int i=0;i<size;i++){
        System.out.print(arr[i] + " ");
    }

    System.out.println();


    //backward travesal
    for(int i=size-1;i>=0;i--){
        System.out.print(arr[i] + " ");
    }
 }   
}
