public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        String str2 = "hello java world";
        String str3 = "apple,banana,orange";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt()
        System.out.println("charAt(1): " + str.charAt(1));

        // 3. substring()
        System.out.println("substring(2): " + str.substring(2));
        System.out.println("substring(2, 7): " + str.substring(2, 7));

        // 4. toUpperCase()
        System.out.println("toUpperCase: " + str.toUpperCase());

        // 5. toLowerCase()
        System.out.println("toLowerCase: " + str.toLowerCase());

        // 6. trim()
        System.out.println("trim: '" + str.trim() + "'");

        // 7. equals()
        System.out.println("equals: " + str.equals(str2));

        // 8. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase: " + str.trim().equalsIgnoreCase(str2));

        // 9. contains()
        System.out.println("contains(\"Java\"): " + str.contains("Java"));

        // 10. startsWith()
        System.out.println("startsWith(\"  He\"): " + str.startsWith("  He"));

        // 11. endsWith()
        System.out.println("endsWith(\"ld  \"): " + str.endsWith("ld  "));

        // 12. replace()
        System.out.println("replace(\"a\", \"@\"): " + str.replace("a", "@"));

        // 13. indexOf()
        System.out.println("indexOf(\"Java\"): " + str.indexOf("Java"));

        // 14. lastIndexOf()
        System.out.println("lastIndexOf(\"a\"): " + str.lastIndexOf("a"));

        // 15. isEmpty()
        String emptyStr = "";
        System.out.println("isEmpty: " + emptyStr.isEmpty());

        // 16. split()
        String[] fruits = str3.split(",");
        System.out.println("split by comma:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // 17. concat()
        System.out.println("concat: " + str.trim().concat(" Rocks!"));

        // 18. compareTo()
        System.out.println("compareTo (str vs str2): " + str.compareTo(str2));

        // 19. matches() - regex
        System.out.println("matches(\".*Java.*\"): " + str.matches(".*Java.*"));

        // 20. toCharArray()
        char[] chars = str.toCharArray();
        System.out.print("toCharArray: ");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
