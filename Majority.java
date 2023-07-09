import java.util.*;
public class Majority {

    public static int major(int arr[],int n){
        int mcount =0;
        int major =0;
        for(int i =0;i<n;i++){
            int count =0;
            for(int j =0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>mcount){
                mcount =count;
                major = arr[i];
            }
        }
        return major;

    }

    public static void main(String[] args){
       int[] arr ={40,50,30,40,50,30,30};
       int n = arr.length;
       System.out.println(major(arr,n));
         
    }
}
