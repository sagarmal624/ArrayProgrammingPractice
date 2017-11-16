import java.util.Scanner;

public class SumMinorDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No of Row in matrix A ");
        int arow = scanner.nextInt();
        System.out.println("Enter No of Column in matrix A ");
        int acol = scanner.nextInt();
        int a[][] = new int[arow][acol];
        int row, col;
        System.out.println("Enter elements in matrix A ");
        for (row = 0; row < arow; row++) {
            for (col = 0; col < acol; col++) {
                a[row][col] = scanner.nextInt();
            }
        }
        System.out.println("Sum=" + sumMinorDiagonal(a, arow, acol));
    }

    public static int sumMinorDiagonal(int a[][], int arow, int acol) {
        int sum = 0, k = 0;
        for (int i = acol - 1; i >= 0 && k <= arow; i--) {
            sum += a[k++][i];
        }
        return sum;
    }
}
