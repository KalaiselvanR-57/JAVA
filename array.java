import java.util.* ;
public class array {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        double sum =0;
        double avg;
        for (int i =0; i < 5; i++) {
                sum +=a[i];

        }
        System.out.println(sum);
            avg=sum/5;
        System.out.print(avg);
    }}
