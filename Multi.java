import java.util.* ;
public class Multi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y,z;
        System.out.println("enter matrix dia: ");
        x = s.nextInt();
        System.out.println("enter matrix row: ");
        y = s.nextInt();
        System.out.println("enter matrix colum: ");
        z = s.nextInt();
        System.out.println("enter matrix array of " + x + "*" + z + "; ");
        int a[][][] = new int[x][y][z];
        for (int k = 0; k < x; k++) {
            for (int i = 0; i < z; i++) {
                for (int j = 0; j < z; j++) {
                    a[k][i][j] = s.nextInt();
                }
            }
        }
        for (int k = 0; k < x; k++) {
            for (int i = 0; i < z; i++) {
                for (int j = 0; j < z; j++) {
                    if (a[k][i][j] % 2 == 0) {
                        System.out.println(a[k][i][j]);
                    }
                }
            }
        }
        System.out.println();
        for (int k = 0; k < x; k++) {
            for (int i = 0; i < z; i++) {
                for (int j = 0; j < z; j++) {
                    if (a[k][i][j] % 2 != 0) {
                        System.out.println(a[k][i][j]);
                    }
                }
            }
        }
        s.close();
    }
}