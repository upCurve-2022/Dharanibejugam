import java.util.Scanner;

public class sequence1 {
    public static void main(String args[]) {
        int N, i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        N = in.nextInt();
        for (i = 0; i <= N; i = i + 2) {
            if ((i % 2) == 0) {
                System.out.print(+-i);
                if((i%2) == 1)
                System.out.print(+i);

            }
        }
    }
}
