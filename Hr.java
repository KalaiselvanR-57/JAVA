import java.util.Scanner;

public class Hr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int term = a;
            System.out.println();
            for (int j = 0; j < n; j++) {
                term += (int)Math.pow(2, j) * b;
                //System.out.print();
                System.out.print(term + " ");
                /*if (j != n - 1) {
                    System.out.print(" ");
                }*/
            }
            System.out.println();
        }

        scanner.close();
    }
}