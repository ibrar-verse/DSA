import java.util.Scanner;

public class AlgorithmComplexityAllInOne {

    // =========================================================================
    // PART 1: 3 APPROACHES TO FIND THE DUPLICATE ELEMENT IN (n + 1) ARRAY
    // Problem: Array of size n + 1 containing numbers from 1 to n with 1 duplicate.
    // =========================================================================

    // Approach 1: Brute Force (Nested Loops) -> O(n^2) Time, O(1) Auxiliary Space
    public static void findDuplicateBruteForce(int[] arr) {
        long steps = 0;
        long startTime = System.nanoTime();
        int duplicate = -1;

        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                steps++;
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                    break outer; // Stop once found
                }
            }
        }

        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1e6;
        System.out.printf("%-35s | %-10s | %-10s | %-12d | %-12.4f ms | Result: %d%n",
                "1. Brute Force (Nested Loops)", "O(n^2)", "O(1)", steps, timeMs, duplicate);
    }

    // Approach 2: Frequency / Seen Array -> O(n) Time, O(n) Auxiliary Space
    public static void findDuplicateFrequencyArray(int[] arr, int n) {
        long steps = 0;
        long startTime = System.nanoTime();
        int duplicate = -1;

        // Auxiliary memory allocated: O(n)
        boolean[] seen = new boolean[n + 1];

        for (int i = 0; i < arr.length; i++) {
            steps++;
            int element = arr[i];
            if (seen[element]) {
                duplicate = element;
                break; // Duplicate found
            }
            seen[element] = true;
        }

        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1e6;
        System.out.printf("%-35s | %-10s | %-10s | %-12d | %-12.4f ms | Result: %d%n",
                "2. Frequency/Flag Array", "O(n)", "O(n)", steps, timeMs, duplicate);
    }

    // Approach 3: Mathematical Sum Formula -> O(n) Time, O(1) Auxiliary Space
    public static void findDuplicateMathSum(int[] arr, int n) {
        long steps = 0;
        long startTime = System.nanoTime();

        long actualSum = 0;
        for (int num : arr) {
            steps++;
            actualSum += num;
        }

        // Formula for sum of 1 to n: n * (n + 1) / 2
        long expectedSum = ((long) n * (n + 1)) / 2;
        long duplicate = actualSum - expectedSum;

        long endTime = System.nanoTime();
        double timeMs = (endTime - startTime) / 1e6;
        System.out.printf("%-35s | %-10s | %-10s | %-12d | %-12.4f ms | Result: %d%n",
                "3. Math Formula (Optimal)", "O(n)", "O(1)", steps, timeMs, duplicate);
    }

    // =========================================================================
    // PART 2: THE 7 CORE LOOP PATTERNS WITH STEP COUNTING
    // =========================================================================

    // Pattern A: Single Linear Loop -> O(n)
    public static void patternLinear(int n) {
        long steps = 0;
        for (int i = 1; i <= n; i++) {
            steps++;
        }
        System.out.printf("%-42s | %-12s | %-15d%n", "Pattern A: Single Linear (i++)", "O(n)", steps);
    }

    // Pattern B: Sequential Independent Loops -> O(n + m)
    public static void patternSequential(int n, int m) {
        long steps = 0;
        for (int i = 1; i <= n; i++) {
            steps++;
        }
        for (int j = 1; j <= m; j++) {
            steps++;
        }
        System.out.printf("%-42s | %-12s | %-15d%n", "Pattern B: Sequential (n + m)", "O(n + m)", steps);
    }

    // Pattern C: Standard Nested Loop -> O(n^2)
    public static void patternStandardNested(int n) {
        int limit = Math.min(n, 20000); // safety cap to prevent freezing on large n
        long steps = 0;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= limit; j++) {
                steps++;
            }
        }
        String label = (n > 20000) ? "Pattern C: Nested Loop (n^2) [capped at 20k]" : "Pattern C: Nested Loop (n^2)";
        System.out.printf("%-42s | %-12s | %-15d%n", label, "O(n^2)", steps);
    }

    // Pattern D: Triangular Dependent Loop -> O(n^2)
    public static void patternTriangular(int n) {
        int limit = Math.min(n, 20000);
        long steps = 0;
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                steps++;
            }
        }
        String label = (n > 20000) ? "Pattern D: Triangular [n(n+1)/2] [capped]" : "Pattern D: Triangular [n(n+1)/2]";
        System.out.printf("%-42s | %-12s | %-15d%n", label, "O(n^2)", steps);
    }

    // Pattern E: Logarithmic Multiplicative Loop -> O(log n)
    public static void patternLogarithmic(int n) {
        long steps = 0;
        for (long i = 1; i <= n; i *= 2) {
            steps++;
        }
        System.out.printf("%-42s | %-12s | %-15d%n", "Pattern E: Logarithmic (i *= 2)", "O(log n)", steps);
    }

    // Pattern F: Linearithmic Mixed Loop -> O(n log n)
    public static void patternLinearithmic(int n) {
        long steps = 0;
        for (int i = 1; i <= n; i++) {
            for (long j = 1; j <= n; j *= 2) {
                steps++;
            }
        }
        System.out.printf("%-42s | %-12s | %-15d%n", "Pattern F: Linearithmic (n * log n)", "O(n log n)", steps);
    }

    // Pattern G: Geometric Series Loop -> O(n)
    public static void patternGeometric(int n) {
        long steps = 0;
        for (long i = 1; i <= n; i *= 2) {
            for (long j = 1; j <= i; j++) {
                steps++;
            }
        }
        System.out.printf("%-42s | %-12s | %-15d%n", "Pattern G: Geometric Series (2n - 1)", "O(n)", steps);
    }

    // Extra: Square Root Condition -> O(sqrt(n))
    public static void patternSquareRoot(int n) {
        long steps = 0;
        for (long i = 1; i * i <= n; i++) {
            steps++;
        }
        System.out.printf("%-42s | %-12s | %-15d%n", "Extra: Square Root (i * i <= n)", "O(sqrt(n))", steps);
    }

    // =========================================================================
    // MAIN RUNNER METHOD
    // =========================================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================================================================");
        System.out.println("             ALGORITHM COMPLEXITY ALL-IN-ONE BENCHMARK & ANALYZER                 ");
        System.out.println("===================================================================================");
        System.out.print("Enter main input size n (recommended: 5000 to 20000): ");
        int n = sc.nextInt();

        System.out.print("Enter secondary input size m for sequential loops (e.g. 3000): ");
        int m = sc.nextInt();

        // ---------------------------------------------------------------------
        // PART 1 RUNNER: Duplicate Element in Array of size (n + 1)
        // ---------------------------------------------------------------------
        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.println("PART 1: THE DUPLICATE ELEMENT PROBLEM (Array size = " + (n + 1) + ")");
        System.out.println("-----------------------------------------------------------------------------------");

        // Build worst-case array: elements 1..n, with duplicate of '1' placed at the end index
        int[] testArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            testArr[i] = i + 1;
        }
        testArr[n] = 1; // Duplicate of 1 placed at the very end

        System.out.printf("%-35s | %-10s | %-10s | %-12s | %-15s | %s%n",
                "Approach", "Time", "Space", "Total Steps", "Clock Time", "Output");
        System.out.println("---------------------------------------------------------------------------------------------------");

        // Execute all 3 approaches
        if (n <= 30000) {
            findDuplicateBruteForce(testArr);
        } else {
            System.out.printf("%-35s | %-10s | %-10s | %-12s | %-15s | %s%n",
                    "1. Brute Force (Nested Loops)", "O(n^2)", "O(1)", "[SKIPPED]", "Too slow (>30k)", "N/A");
        }
        findDuplicateFrequencyArray(testArr, n);
        findDuplicateMathSum(testArr, n);

        // ---------------------------------------------------------------------
        // PART 2 RUNNER: The 7 Loop Patterns
        // ---------------------------------------------------------------------
        System.out.println("\n-----------------------------------------------------------------------------------");
        System.out.println("PART 2: THE 7 LOOP PATTERNS - MATHEMATICAL STEP COUNT FOR n = " + n);
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-42s | %-12s | %-15s%n", "Loop Pattern Structure", "Theoretical", "Actual Steps Counted");
        System.out.println("-----------------------------------------------------------------------------------------");

        patternSquareRoot(n);
        patternLogarithmic(n);
        patternLinear(n);
        patternGeometric(n);
        patternSequential(n, m);
        patternLinearithmic(n);
        patternTriangular(n);
        patternStandardNested(n);

        System.out.println("===================================================================================");
        System.out.println("KEY OBSERVATION:");
        System.out.println("Look at Pattern G: even with nested loops, it takes ~2n steps!");
        System.out.println("This proves: Structure != Complexity. Always count the total mathematical steps.");
        System.out.println("===================================================================================");

        sc.close();
    }
}