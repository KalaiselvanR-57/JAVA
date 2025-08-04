import java.util.* ;
public class sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j,n,temp;
        System.out.print("size of array: ");
        n =s.nextInt();
        int []a = new int[n];
        System.out.println("array value: ");
        for(i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
                System.out.print(a[i]+",");
        }
        System.out.println();
        System.out.println("Second largest value");
        System.out.println(a[n-2]);
    }}
