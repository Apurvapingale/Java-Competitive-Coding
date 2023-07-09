import java.util.*;
public class SwapNibbles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int swapnum;
        swapnum = ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
System.out.println("Before Swapping the Nibble" +n);
System.out.println("\n After Swapping the nibble:" +swapnum);
sc.close();


    }
    
}
