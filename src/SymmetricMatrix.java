import java.util.Scanner;

public class SymmetricMatrix {
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
        System.out.println(isSymmetric(a, arow, acol) ? "Given Matrix is Symmetric Matrix" : "Given Matrix is not a Symmetric Matrix");
    }

    public static boolean isSymmetric(int a[][], int arow, int acol) {
        int c[][] = new int[acol][arow];
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < acol; j++) {
                c[i][j] = a[j][i];
            }
        }
        boolean flag = true;
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < acol; j++) {
                if (c[i][j] != a[i][j]) {
                    flag = false;
                    break;
                }

            }
            if (!flag)
                break;
        }
        return flag;
    }

}
