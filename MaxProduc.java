import java.util.*;
public class MaxProduc {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements:");
     int n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter thr elements:");
     for(int i =0;i<n;i++){
        arr[i] = sc.nextInt();
     }
 int res=arr[0];
    
    for(int i =0;i<n;i++){
        int mul = arr[i];
        for(int j =i+1;j<n;j++){
            res = Math.max(res,mul);
            mul*=arr[j];
        }
        res = Math.max(res,mul);
    }
    System.out.println("Maximum Product:" + res);
    }
   
}
