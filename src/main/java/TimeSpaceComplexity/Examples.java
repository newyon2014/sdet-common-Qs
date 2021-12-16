package TimeSpaceComplexity;

public class Examples {
    public static void main(String[] args) {
        int n = 20;
        // --> O(n)
        for (int i = 0; i < n; i++) {
            System.out.println("Statment");
        }
        // --> O(n)
        for (int i = n; i > 0; i--) {
            System.out.println("Statment");
        }
        // --> O(n/2) = O(n)
        for (int i = 0; i < n; i += 2) {
            System.out.println("Statment");
        }
        // --> O(n2) --
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                System.out.println("Statment");
            }
        }
        // --> O(n2) --
        // 1 + 2 + 3 + ... = n(n+1)/2 = n2 +1 /2 = n2
        /*
            i    j    No of times
            0     X       0
            0     0       1
                  1X
            2     0       2
                  1
                  2X
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Statment");
            }
        }
        // --> O(sqrt of n)
        /*
            i     p
            1     0 + 1
            2     1 + 2
            3     1 + 2 + 3 + 4
            4     1 + 2 + 3 + 4 + 5
            k --> 1 + 2 + 3 + 4 + 5 + k
            P = k(k+1) / 2 > n -- that is when it will stop repeating
            k2 = n --> k sqrt of n
         */
        int p = 0;
        for (int i = 0; p <= n; i++) {
            p = p + i;
        }
        // --> O(log 2 n)
        /*
            i
            1
            1X2 = 2
            2 X 2 = 2 square
            2 square X 2 = 2 power of 3
            i = 2 power k - assume that this is when it will stop repeating
            2 power k = n
            k = log 2 n
         */

        for (int i = 0; i < n; i *= 2) {
            System.out.println("Statment");
        }
        // Same example as above but n changed to p
        // O(log 2 p)
        for (int i = 0; i < p; i *= 2) {
            System.out.println("Statment");
        }

        // --> O(log 2 n)
        /*
            i
            n
            n/2
            n/4
            n/8
            n / 2 power of k
            n / 2 power of k = 1 --> this is when it will stop repeating
            k = log 2 (n)
         */

        for (int i = n; i > 1; i /= 2) {
            System.out.println("Statment");
        }

        // --> O(sqrt(n))
        /*
            i*i = n --> this is when it will termninate
           i **2 = n --> i =  sqrt(n)
         */

        for (int i = 0; i*i < n; i++) {
            System.out.println("Statment");
        }

    }
}
