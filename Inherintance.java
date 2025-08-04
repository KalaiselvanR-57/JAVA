import java.util.*;
public class Inherintance {
    static class dad{
        static int salary=10000;
        static void disp(){
    System.out.println("saving :"+ salary);
    }
}
    static class son extends dad {
    int fees=5000;
    }
    static class daughter extends dad {
        int iphone=5000;
    }
    static class collage extends son{
        int amount=this.salary-this.fees;

    }
    static class expence extends daughter {
        int amount2= this.salary - this.iphone;
    }
    public static void main(String[] args) {
        collage a=new collage();
        System.out.println(a.amount);
        expence b=new expence();
        System.out.println(b.amount2);
        b.disp();
    }
}

