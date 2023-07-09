import java.util.*;


class ss {
    public static void seive(int limit){
        boolean prime[]=new boolean[limit+1];

        for(int i=2;i<=limit;i++){
            prime[i]=true;
        }

        for(int p = 2; p*p<=limit;p++){

            if(prime[p]==true){
                for(int i =p*p; i <=limit;i+=p){
                    prime[i]=false;
                }
            }
        }

        for(int p =2; p<=limit; p++){
            if(prime[p]==true){
                System.out.println(p + " ");
            }
        }



    }
    public static void main(String[] args){
        // System.out.println("Enter no:");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        seive(50);
        // sc.close();
    }
    
}
