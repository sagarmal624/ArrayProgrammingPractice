import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No of Row in matrix A ");

        int arow = scanner.nextInt();
        System.out.println("Enter No of Column in matrix A ");

        int acol = scanner.nextInt();
        System.out.println("Enter No of Row in matrix B ");

        int brow = scanner.nextInt();
        System.out.println("Enter No of Column in matrix B ");

        int bcol = scanner.nextInt();
        int a[][] = new int[arow][acol];
        int b[][] = new int[brow][bcol];

        int row, col;

        System.out.println("Enter elements in matrix A ");
        for (row = 0; row < arow; row++) {
            for (col = 0; col < acol; col++) {
                a[row][col] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements in matrix B ");
        for (row = 0; row < brow; row++) {
            for (col = 0; col < bcol; col++) {
                b[row][col] = scanner.nextInt();
            }
        }
        multipliction(a, b, arow, acol, brow, bcol);
    }

    public static void multipliction(int a[][], int b[][], int arow, int acol, int brow, int bcol) {
        if (acol == brow) {
            int c[][] = new int[acol][brow];
            for (int i = 0; i < arow; i++) {
                for (int j = 0; j < acol; j++) {
                    int sum = 0;
                    for (int k = 0; k < brow; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    c[i][j] = sum;
                }
            }
            System.out.println("Matrix Multiplication");
            for (int i = 0; i < brow; i++) {
                for (int j = 0; j < bcol; j++) {
                    System.out.print(" " + c[i][j]);
                }
                System.out.println("");
            }

        } else
            System.out.println("Matrix Multiplication is not possible");


    }
}
