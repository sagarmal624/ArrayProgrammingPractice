public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2, n = 7;

        leftRotateOneByOne(arr,d, n);
    }

    public static void leftRotateOneByOne(int a[], int d, int n) {
        for (int i = 0; i < d; i++) {
            int temp = a[0];
            int j;
            for (j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void leftRotate(int a[], int d, int n) {
        int[] temp = new int[d];
        int k = 0;
        for (int i = 0; i < d; i++) {
            temp[i] = a[i];
        }
        for (int i = d; i < n; i++) {
            a[i - d] = a[i];
            k++;
        }
        for (int j = 0; j < d; j++) {
            a[k++] = temp[j];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
