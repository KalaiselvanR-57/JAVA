import java.util.*;
public class Qus {
    public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("Range");
    int n=s.nextInt();
    int a=0,sum;
    int b=1;
    for (int i=0;i<=n;i++){
        sum=a+b;
        System.out.print(sum+",");
        a=b;
        b=sum;
    }
        s.close();
    }
}