import java.util.*;
public class Ops {
   static int a,b,x,y;
    static Scanner s=new Scanner(System.in);
    static void add(){
        System.out.println("Enter the sum values");
        a=s.nextInt();
        b=s.nextInt();
        a=a+b;
        System.out.println(a);
        }
    int sub(){
        System.out.println("Enter the diff values");
        x=s.nextInt();
        y=s.nextInt();
        x=x-y;
        return (x);
    }
public static void main(String[] args) {
    Ops obj = new Ops();

    add();
    obj.sub();
    System.out.println("," + obj.sub());

}}