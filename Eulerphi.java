import java.util.Scanner;

public class Eulerphi {
    
    public static int phi(int n){
        int result = n;

        for(int p=2;p*p<=n;p++){
            if(n%p==0){
                while(n%p==0){
                    n/=p;
                }
                result -= result/p;
            }
        }
        if(n>1){
            result -= result/n;

        }
        return result;

    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of");
        int n = sc.nextInt();
        int phi_n = phi(n);
        System.out.println("phi("+n+") ="+ phi_n);
        sc.close();
    }
    
}
