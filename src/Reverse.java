public class Reverse {
    public static void main(String[] args) {
        int a[] = {1, 4, 2, 5, 3, 5};
        reverseArray(a);
    }

    public static void reverseArray(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            a[i] = a[i] + a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i] - a[a.length - 1 - i];
            a[i] = a[i] - a[a.length - 1 - i];

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
