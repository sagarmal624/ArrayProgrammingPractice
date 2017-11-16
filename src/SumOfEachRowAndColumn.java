import java.util.Scanner;

public class SumOfEachRowAndColumn {
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
        sumRowAndColumn(a, arow, acol);
    }

    public static void sumRowAndColumn(int a[][], int arow, int acol) {
        int rowSum = 0, colSum = 0;
        System.out.println("Row,Col");

        for (int i = 0; i < arow; i++) {
            colSum = 0;
            rowSum = 0;
            for (int j = 0; j < acol; j++) {
                colSum += a[j][i];
                rowSum += a[i][j];
            }
            System.out.println(rowSum + " , " + colSum);
        }
    }
}
