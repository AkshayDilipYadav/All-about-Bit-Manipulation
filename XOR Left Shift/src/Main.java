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
    public static int orLeftShift(int A, int B){
        int result  =A ^ (1 << B);
        return result;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int B = sc.nextInt();
        int result = orLeftShift(A,B);

        String bitsOf = getBits(A);
        System.out.println ("If B bit is unset then set and if B Bit is set then unset "+result);
        System.out.println(bitsOf);

        String bitsOfResult = getBits(result);
        System.out.println(bitsOfResult);

    }
}