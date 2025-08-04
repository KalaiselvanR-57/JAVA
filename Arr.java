import java.util.* ;
public class Arr {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int x,z;
        System.out.println("enter matrix row; ");
        x=s.nextInt();
        System.out.println("enter matrix colum; ");
        z=s.nextInt();
        System.out.println("enter matrix array of "+x +"*"+z+"; ");
        int a[][]=new int[x][z];
        for (int i=0;i<x;i++){
            for (int j=0;j<z;j++){
                a[i][j]=s.nextInt();
            }
        }
        int tsum=0;
        int sum=0;
        for (int i=0;i<x;i++){
            sum=0;
            for (int j=0;j<z;j++){
                sum=sum+a[i][j];
            }
            System.out.println(sum);
            tsum+=sum;
    }

        System.out.println(tsum);
}}
