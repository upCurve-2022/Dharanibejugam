

import java.util.*;
 class x {
    public static  void main(String args[]) {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = i + 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println(" ");
        }
    }
}
