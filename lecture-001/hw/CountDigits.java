import java.util.*;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        do {
            d++;
            n /= 10;
        } while (n != 0);
        System.out.println(d);
    }
}
