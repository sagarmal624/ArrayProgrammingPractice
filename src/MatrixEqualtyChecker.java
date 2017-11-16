import java.util.Scanner;

public class MatrixEqualtyChecker {

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
        System.out.println(isEqual(a, b, arow, acol, brow, bcol));
    }

    public static Boolean isEqual(int a[][], int b[][], int arow, int acol, int brow, int bcol) {
        if (arow == brow && acol == bcol) {
            Boolean flag = Boolean.TRUE;
            for (int i = 0; i < arow; i++) {
                for (int j = 0; j < acol; j++) {
                    if (a[i][j] != b[i][j]) {
                        flag = Boolean.FALSE;
                        break;
                    }
                }
                if (flag == Boolean.FALSE) {
                    break;
                }
            }
            return flag;

        } else
            return false;

    }
}
