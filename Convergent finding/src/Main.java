import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        ArrayList<Integer> coef = new ArrayList<>();
        while (b != 0) {
            System.out.println(a+"/"+b);
            coef.add(a / b);
            int temp = a % b;
            a = b;
            b = temp;
            System.out.println(coef);
        }
    }
}
