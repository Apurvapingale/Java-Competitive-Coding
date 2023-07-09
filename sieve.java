import java.util.*;

public class sieve{
    public static void SimpleSieve(int limit){
        boolean[] prime = new boolean[limit+1];
        for(int i =2; i<=limit;i++){
            prime[i]=true;
        }
        for(int p=2;p*p<=limit;p++){
            if(prime[p]==true){
                //multiple of i is false
                for(int i =p*p;i<=limit;i+=p){
                    prime[i]=false;
                }
            }
        }

    
        //traverse
        for (int p=2;p<=limit;p++){
            if(prime[p]==true){
                System.out.println(p+" ");
            }
        }
    }
    public static void main(String[] args){
        SimpleSieve(50);
    }
}