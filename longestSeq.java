import java.util.*;
import java.util.Scanner;

class longestSeq {  
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int p=0,c=0,m=0;
       while(n!=0){
        if((n&1)==1){
            c++;
        }
        else{
            if((n%2)==0){
                p=0;
            }
            else{
                p=c;
                c=0;
            }
        }
        m=Math.max(c+p,m);
        n=n>>1;
    }
    System.out.println(m+1);
    }
}
