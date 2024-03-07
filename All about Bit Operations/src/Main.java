import java.util.Scanner;
public class Main{

        public static String bitwiseAND (int A, int B){
        int result = A&A;
        return Integer.toBinaryString(result);

    }
    public static String bitwiseOR (int A, int B){
        int result = A|B;
        return Integer.toBinaryString(result);
    }
    public static String bitwiseXOR (int A, int B){
        int result = A^B;
        return Integer.toBinaryString(result);
    }
    public static String bitwiseNOT (int A){
        int numberOfBits = 32;
        int result = ~A & ((1 << numberOfBits) - 1);
        return Integer.toBinaryString(result);
    }
public static int leftShift (int lftnum, int lftshift){
            return lftnum << lftshift;
}
    public static int rightShift (int rghtnum, int rghtshift){
        return rghtnum >>  rghtshift;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();
        System.out.println("Enter the int for left shift and how many times to shift:");
        int lftnum= sc.nextInt();
        int lftshift= sc.nextInt();
        int leftShifted = leftShift( lftnum, lftshift) ;
        System.out.println("Enter the int for right shift and how many times to shift:");
        int rghtnum= sc.nextInt();
        int rghtshift= sc.nextInt();
        int rightShifted = rightShift(rghtnum,rghtshift);
        System.out.println("Enter the int for left shift and how many times to shift:");
        System.out.println("Binary A is:"+Integer.toBinaryString(A));
        System.out.println("Binary B is:"+Integer.toBinaryString(B));
        System.out.println("If both bits are 1, it gives 1, else it shows 0. Bitwise AND: " + bitwiseAND(A,B) +" "+ Integer.parseInt(bitwiseAND(A,B),2));
        System.out.println("If either of the bits is 1, it gives 1, else it shows 0. Bitwise OR:" + bitwiseOR(A,B)+" "+ Integer.parseInt(bitwiseOR(A,B),2));
        System.out.println("If corresponding bits are different, it gives 1, else it shows 0. Bitwise XOR: " + bitwiseXOR(A,B)+" "+ Integer.parseInt(bitwiseXOR(A,B),2));
        System.out.println("It makes every 0 to 1, and every 1 to 0.  Bitwise NOT: " + bitwiseNOT(A)+" "+ Integer.parseInt(bitwiseNOT(A),2));

        System.out.println("Left Shifted:" + leftShifted + "in binary:" + Integer.toBinaryString(leftShifted));
        System.out.println("Right Shifted:" +rightShifted + "in binary:" + Integer.toBinaryString(rightShifted));
    }
}