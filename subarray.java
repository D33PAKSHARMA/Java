import java.util.Scanner;

public class subarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0,max=-4656;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<=n;j++){
                sum+=arr[j];
            }
            max=Math.max(sum,max);
            // System.out.print(max);
        }
        System.out.println(max);
    }
    
}
