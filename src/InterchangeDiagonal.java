import java.util.Scanner;

public class InterchangeDiagonal {
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
        interchange(a, arow, acol);
    }

    public static void interchange(int a[][], int arow, int acol) {
        if (arow == acol) {
            for (int i = 0; i < acol; i++) {
                if (i != acol / 2) {
                    int temp = a[i][i];
                    a[i][i] = a[i][acol - i - 1];
                    a[i][acol - i - 1] = temp;
                }
            }
            System.out.println("After chaning diagonal element");
            for (int row = 0; row < arow; row++) {
                for (int col = 0; col < acol; col++) {
                    System.out.print(" " + a[row][col]);
                }
                System.out.println();
            }
        } else
            System.out.println("Inerchange not possible due to row and col size not equal");
    }


}
