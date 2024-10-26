import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int N = (int) Math.sqrt(n);

        if (N * N == n) {
            System.out.println("Perfect square, no continued fraction expansion.");
            return;
        }

        int capP = 0;
        int capQ = 1;
        int k = 0;

        Set<String> seenPairs = new HashSet<>();

        while (true) {
            int a = (capP + N) / capQ;
            System.out.println(k + " " + capP + " " + capQ + " " + a);
            // Store the current pair to check for cycles
            String currentPair = capP + "," + capQ;
            if (seenPairs.contains(currentPair)) {
                break; // Terminate if we encounter a repeating state
            }
            seenPairs.add(currentPair);
            // Update capP and capQ for the next term in the sequence
            int nextCapP = a * capQ - capP;
            int nextCapQ = (n - nextCapP * nextCapP) / capQ;
            capP = nextCapP;
            capQ = nextCapQ;
            k++;
        }
    }
}
