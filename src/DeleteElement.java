public class DeleteElement {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 2, 5, 6};
        delete(a, 4);
        delete(a, a.length, 5);
    }

    public static int delete(int arr[], int n, int x) {
        if (arr[n - 1] == x)
            return (n - 1);
        int prev = arr[n - 1], i;
        for (i = n - 2; i >= 0 && arr[i] != x; i--) {
            int curr = arr[i];
            arr[i] = prev;
            prev = curr;
        }
        if (i < 0)
            return 0;
        arr[i] = prev;
        return (n - 1);
    }

    public static void delete(int a[], int k) {
        int size = a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                --size;
                for (int j = i + 1; j < a.length; j++) {
                    a[i] = a[j];
                    i++;
                }
                break;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
