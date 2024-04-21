import java.util.Scanner;

public class Main {
    public static int singleNumbertwo (int [] A){
        int ans = 0;
        int n = A.length;
        for (int b = 0; b < 32; b++){
            int count = 0;
            for (int i = 0; i < n; i++){
                int num = A[i];
                if (((num >> b)&1)==1){
                    count++;
                }
            }
            if (count % 3 == 1){
                ans |= (1<<b);
            }
        }
        return ans;
    }
    public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int [] A = new int[N];
for (int i =0; i <N; i++){
    A[i] = sc.nextInt();
}
int result = singleNumbertwo (A);
System.out.println(result);
    }
}