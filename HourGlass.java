import java.util.*;
public class HourGlass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix =new int [rows][cols];
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum =0;int max=0;
        for(int i =0; i<rows-2;i++){
            for(int j =0;j<cols-2;j++){
                sum = (matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2]);
                if(sum>max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
