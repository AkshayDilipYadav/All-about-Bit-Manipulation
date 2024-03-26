import java.util.Scanner;
public class Main {

    public static String getBits (int A) {
        char[] bits = new char [32];
        for (int i = 31; i >=0; i--){
            int bit = (A >> i)&1;
            bits[31-i] = (char)(bit + '0');
        }
        return new String(bits);
    }

    public static int checkBit(int A, int B){
        int mask = 1 << B;
        if ((A & mask)!=0){return 1;}
        else {return 0;}
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(getBits(A));

        System.out.println(checkBit(A, B));
    }
}