import java.util.*;
public class square {
    public static void main (String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            if(i==4)
                continue;
            else
                System.out.println(i*i);
        }
    }
}