
import java.util.Scanner;
public class Main {
    public static String getBits(int A){
        char[] bits = new char[32];
        for (int i = 31; i >= 0; i--){
            int bit = (A>>i)&1;
            bits[31-i] = (char)(bit + '0');
        }
        return new String(bits);
    }

    public static int setBit (int A, int B) {
        int maskA = 1 << A;
        int maskB= 1 << B;
        int result = maskA | maskB;
        return result;
    }
    public static void main (String[] args) {
        Scanner sc  = new Scanner (System.in);
        int A  = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(setBit(A,B));System.out.print(" ");
        System.out.println(getBits(setBit(A,B)));

    }
}