public class fibonacciseries {
    public static void main(String[] args) {
        int n = 10; // number of terms to display
        int firstTerm = 0, secondTerm = 1;
        
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
