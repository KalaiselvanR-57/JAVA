import java.util.*;
public class Test {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int x,z;
        System.out.println("enter matrix row; ");
        x=s.nextInt();
        System.out.println("enter matrix colum; ");
        z=s.nextInt();
        System.out.println("enter matrix array of ; "+x +"*"+z);
        int a[][]=new int[x][z];
        for (int i=0;i<x;i++){
            for (int j=0;j<z;j++){
                a[i][j]=s.nextInt();
            }
            }
        for (int i=0;i<x;i++){
            for (int j=0;j<z;j++) {
                System.out.print(a[i][j]+" ");
            }System.out.println();
            }
}}
