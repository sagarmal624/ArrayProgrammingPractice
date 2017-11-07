import java.util.HashSet;
import java.util.Set;

public class FirstRepeat {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1, 4, 5, 2};
        Set set = new HashSet<>();
        for (int i : a) {
            if (set.add(i) == false) {
                System.out.println(i);
                break;
            }
        }
    }

}
