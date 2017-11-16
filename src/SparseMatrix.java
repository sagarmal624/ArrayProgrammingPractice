import java.util.Scanner;

public class SparseMatrix {
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
        System.out.println(isSparse(a, arow, acol) ? "Sparse Matrix" : "Not a sparse matrix");
    }

    public static boolean isSparse(int a[][], int arow, int acol) {
        int count = 0;
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < acol; j++) {
                if (a[i][j] == 0) {
                    ++count;
                }
            }
        }
        if (count > ((arow * acol) / 2))
            return true;
        else
            return false;
    }
}
