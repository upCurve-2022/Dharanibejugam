import java.util.Scanner;

public class reverse {
    public static void main(String args[]){
        int n,rev=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        while(n!=0){
            int remainder=n%10;
            rev=rev*10+remainder;
            n=n/10;
        }
        System.out.print("the reverse of given number is:"+rev);
    }
}
