import java.util.Scanner;
public class Main {

    public static String getBits(int A){
        char[] bits = new char[32];

        for (int i = 31; i >= 0; i--){
            int bit = (A >> i)& 1;
            bits[31-i] = (char) (bit + '0');
        }
        return new String(bits);
    }


    public static int bitwiseAnd(int A, int B){
int result = A & B;
return result;
    }
    public static int bitwiseOr(int A, int B){
        int result = A | B;
        return result;
    }

    public static int bitwiseXor(int A, int B){
        int result = A ^ B;
        return result;
    }

    public static int bitwiseComplement(int A){
        int result = ~A;
        return result;
    }
    public static int rightShift(int A, int rightShifter ){
        int result = A >> rightShifter;
        return result;
    }
    public static int leftShift(int A, int leftShifter ){
        int result = A << leftShifter;
        return result;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int rightShifter = sc.nextInt();
        int leftShifter = sc.nextInt();

String bitsA = getBits(A);
        String bitsB = getBits(B);
        System.out.println(bitsA);
        System.out.println(bitsB);

        int resultAnd = bitwiseAnd(A,B);


        String bitsResult = getBits(resultAnd);
        System.out.println(bitsResult);
        System.out.println( A+"&"+B + " if both are 1 then 1 else 0 " +resultAnd);
        System.out.println();

        int resultOr = bitwiseOr(A,B);
        System.out.println(bitsA);
        System.out.println(bitsB);
        String bitsResultOr = getBits(resultOr);
        System.out.println(bitsResultOr);
        System.out.println( A+"|"+B + " if either is 1 then 1 else 0 " +resultOr);

        System.out.println();

        int resultXor = bitwiseXor(A,B);
        System.out.println(bitsA);
        System.out.println(bitsB);
        String bitsResultXor = getBits(resultXor);
        System.out.println(bitsResultXor);
        System.out.println( A+"^"+B + " if both are different then 1 else 0 " +resultXor);

        System.out.println();

        int resultComplement = bitwiseComplement(A);
        System.out.println(bitsA);
        String bitsResultComplement = getBits(resultComplement);
        System.out.println(bitsResultComplement);
        System.out.println( "~"+A + " if both are different then 1 else 0 " +resultComplement);

        System.out.println();


        int rightshifed = rightShift ( A, rightShifter);
        String bitsResultrightShift = getBits(rightshifed);
        System.out.println(bitsResultrightShift );
        System.out.println( A + " Right Shifted "+ rightShifter+" times " +rightshifed);

        System.out.println();


        int leftshifed = leftShift ( A, leftShifter);
        String bitsResultleftShifted = getBits(leftshifed);
        System.out.println(bitsResultleftShifted );
        System.out.println( A + " Left Shifted "+ leftShifter+" times " +leftshifed);




    }
}