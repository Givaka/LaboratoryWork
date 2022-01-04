package lab8;

public class TrueTable {
    public static void main(String[] args) {
        boolean a = true, b = false;


        System.out.println("1. a and b\t" + (a&&b));
        System.out.println("2. (a and b) or b\t" + ((a && b) || b));
        System.out.println("3. (a and b) or not (a and b)\t" + ((a && b) || !(a && b)));
        System.out.println("4. a and b or not (a or b) or b\t" + (a && b || !(a || b) || b));
        System.out.println("5. b and b or not a and (a or b or a) or not (a or b)\t" + (b && b || !(a) && (a || b || a) || !(a ||b)));
        System.out.println("6. 1 << 2\t" + (1 << 2));
        System.out.println("7. 1 & 0 | 1 >> 1\t" + (1 & 0 | 1 >> 1));
        System.out.println("8. 1 & 0 | 1 >> 0\t" + (1 & 0 | 1 >> 0));
        System.out.println("9. 0b101 & 0b111 ^ 0b111 | 0b010\t" + (0b101 & 0b111 ^ 0b111 | 0b010));
        System.out.println("10. (7 & 9) ^ (1 | 0) & (3 & 4)\t" + ((0b0111 & 0b1001) ^ (0b0001 | 0b0000) & (0b0011 & 0b0100)));
        System.out.println("end.");



    }
}
