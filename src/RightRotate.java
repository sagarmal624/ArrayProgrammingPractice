public class RightRotate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2, n = 7;
        rightRotateOneByOne(arr, d, n);
    }

    public static void rightRotateOneByOne(int a[], int d, int n) {
        for (int i = 0; i < d; i++) {
            int temp = a[n - 1];
            int j;
            for (j = n - 2; j >= 0; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
