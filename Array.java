import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        // int[] arr=new int[5];//Decleration of array by new keyword
        // arr[0]=2;
        // arr[1]=4;
        int arr[]={5,2,5,6,7};//Decleration of array
        int s=arr.length;//length of a array
        System.out.println(s);
        Arrays.sort(arr);//sort the array
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }

    }
    
}
