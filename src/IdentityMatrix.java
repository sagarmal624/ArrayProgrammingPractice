import java.util.Scanner;

public class IdentityMatrix {
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
        System.out.println(isIdentity(a, arow, acol) ? "This Matrix is an Unit Matrix" : "This Matrix is not an Unit Matrix");
    }

    public static boolean isIdentity(int a[][], int arow, int acol) {
        boolean flag = true;
        if (arow == acol) {
            for (int i = 0; i < arow; i++) {
                for (int j = 0; j < acol; j++) {
                    if (a[i][j] != 0) {
                        if (a[i][i] != 1) {
                            flag = false;
                            break;
                        }
                    }
                }
                if (!flag)
                    break;
            }
        } else
            return false;
        return flag;
    }
}
