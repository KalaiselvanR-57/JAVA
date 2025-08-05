class Asus {
    // Static method that returns both a and b as an array
    static int[] ab() {
        int a = 5;
        int b = 34;
        return new int[]{a, b}; // Return both values in an array
    }

    // Non-static method that returns both a and b as an array
    int[] bc() {
        int a = 9;
        int b = 4;
        // System.out.print("Value from bc(): " + a); // Print a
        return new int[]{a, b}; // Return both values
    }
}

public class Override {
    public static void main(String[] args) {
        Asus obj = new Asus(); // Create object

        // Call static method and store result
        int[] ab = Asus.ab();  // abValues[0] = 5, abValues[1] = 34

        // Call non-static method and store result
        int[] bc = obj.bc();  // bcValues[0] = 9, bcValues[1] = 4

        // Use both returned values
        int c = ab[0] + ab[1]; // 5 + 34 = 39
        int d = bc[0] + bc[1]; // 9 + 4 = 13

        // Output results
        System.out.println("\nSum from ab(): " + c);  // 39
        System.out.println("Sum from bc(): " + d);    // 13
    }
}
