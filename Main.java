import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int salery=s.nextInt();
        int age=s.nextInt();
        int lone;
        if (salery>=20000||age<=25){
            System.out.println("Enter lone amount");
            lone=s.nextInt();
                if (lone<=50000) {
                    System.out.println("youre are eligibe");
                }
                else{
                    System.out.println("its greater then lone amount");
                }
            }
        else {
            System.out.println("you are not eligible");
        }
    }
}