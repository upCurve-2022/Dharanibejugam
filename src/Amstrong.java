public class Amstrong {
    public static void main(String[] args) {
        int n = 371, x, remainder, result = 0;
        x = n;
        while (x != 0)
        {
            remainder = x % 10;
            result += Math.pow(remainder, 3);
            x /= 10;
        }
        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
