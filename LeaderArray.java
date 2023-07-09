import java.util.*;
public class LeaderArray
{
	
public static void main (String[] args){
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  int[] arr=new int[n];
  for(int i=0; i<n;i++ ){
    arr[i]=sc.nextInt();
  } 
  int max =0;
  max=arr[n-1];
  System.out.println(max);
  for(int i =(n-2);i>=0;i--){
    if(arr[i]>max){
        System.out.println(arr[i]);
    }else{
        max=arr[i];
    }
  }

}
}
