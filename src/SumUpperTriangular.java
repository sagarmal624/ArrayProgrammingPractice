import java.util.Scanner;

public class SumUpperTriangular {
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
        findUpperTriangular(a, arow, acol);
    }

    public static void findUpperTriangular(int a[][], int arow, int acol) {
        int sum = 0;
        for (int i = 0; i < arow; i++) {
            for (int j = 0; j < acol; j++) {
                if (j >= i)
                    sum += a[i][j];
            }
        }
        System.out.println("Sum="+sum);

    }
}
