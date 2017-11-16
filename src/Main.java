import java.util.*;

public class Main {
    public static void main(String arg[]) {
        int a[] = {1, 2, 2, 3, 5, 4, 5, 3, 4};
        System.out.println(findSingle(a));
    }

    public static void findDuplicateByBruteForceMethod(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("duplicate numbere found" + a[i]);
                }
            }
        }

    }

    public static void findDuplicates(int a[]) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            Integer counter = map.get(a[i]);
            if (counter == null)
                map.put(a[i], 1);
            else
                map.put(a[i], ++counter);
        }
        map.entrySet().stream().filter(it -> it.getValue() > 1).map(it -> it.getKey()).forEach(System.out::println);
    }

    public static void findDuplicateUsingSet(int a[]) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            if (set.add(i) == false) {
                System.out.println("duplicate element found" + i);
            }
        }
    }

    public static boolean contains(int a[], int k) {
        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void findPair(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            int first = a[i];
            for (int j = i + 1; j < a.length; j++) {
                int sec = a[j];
                if (first + sec == k) {
                    System.out.println(first + " , " + sec);
                }
            }
        }
    }

    public static void findDuplicatesForSortedArray(int a[]) {
        int prev = a[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], 1);
        }
        for (int i = 1; i < a.length; i++) {
            if (prev == a[i]) {
                Integer counter = map.get(a[i]);
                map.put(a[i], ++counter);
            }
            prev = a[i];
        }
        map.entrySet().stream().filter(it -> it.getValue() > 1).map(it -> it.getKey()).forEach(System.out::println);
    }

    public static void removeDuplicateUsingHashMap(int a[]) {
        Map<Integer, Integer> map = new HashMap();
        for (int i : a) {
            Integer num = map.get(i);
            if (num == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++num);
            }
        }
        map.entrySet().stream().map(it -> it.getKey()).forEach(System.out::println);
    }

    public static void removeDuplicateUsingSet(int a[]) {
        Set<Integer> set = new HashSet();
        for (int i : a) {
            set.add(i);
        }
        set.stream().forEach(System.out::println);
    }

    public static void removeDuplicateWhenArraySorted(int a[]) {
        int prev = a[0];
        System.out.println(a[0]);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != prev) {
                System.out.println(a[i]);
            }
            prev = a[i];
        }
    }

    public static void findIntersectionUsingJava8(int a[], int b[]) {
        Arrays.stream(a).filter(i -> !Arrays.stream(b).anyMatch(j -> i == j)).forEach(System.out::println);
    }


    public static void findIntersectionUsingCollection(int a[], int b[]) {
        Set set = new HashSet(Arrays.asList(a));
        Set common = new HashSet();
        for (int i : b) {
            if (!set.contains(i)) {
                common.add(i);
            }
        }
        common.stream().forEach(System.out::println);
    }

    public static void findIntersection(int a[], int b[], int c[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.println(a[i]);
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k])
                j++;
            else
                k++;
        }
    }

    static int findSingle(int ar[]) {
        int res = ar[0];
        for (int i = 1; i < ar.length; i++)
            res = res ^ ar[i];
        return res;
    }


    public static void findIntersection(int a[], int b[]) {
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else
                j++;
        }
    }

    public static int[] removeDuplicatesForUnSortedAray(int input[]) {
        int j = 0, i = 1;
        if (input.length < 2) {
            return input;
        }
        while (i < input.length) {
            if (input[i] == input[j]) {
                i++;
            } else {
                input[++j] = input[i++];
            }
        }
        int[] output = new int[j + 1];
        for (int k = 0; k < output.length; k++) {
            output[k] = input[k];
        }

        return output;
    }

    public static void minimumSumByChoosingPair(int a[]) {
        int first, second;
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < first) {
                second = first;
                first = a[i];
            } else if (a[i] < second && a[i] != first) {
                second = a[i];
            }
        }
        System.out.println(first + "," + second);
    }

    public static int missingNumber(int a[], int n) {
        int expectedSum = ((n + 1) * ((n + 1) - 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < a.length; i++) {
            actualSum += a[i];
        }
        return expectedSum - actualSum;
    }

    public static void findCountsforUnsortedArray(int arr[], int n) {
        int i = 0;
        while (i < n) {
            if (arr[i] <= 0) {
                i++;
                continue;
            }
            int elementIndex = arr[i] - 1;
            if (arr[elementIndex] > 0) {
                arr[i] = arr[elementIndex];
                arr[elementIndex] = -1;
            } else {
                arr[elementIndex]--;
                arr[i] = 0;
                i++;
            }
        }
        System.out.println("Below are counts of all elements");
        for (int j = 0; j < n; j++)
            System.out.println(j + 1 + "->" + Math.abs(arr[j]));
    }

    public static void countFrequency(int a[]) {

        int prev = a[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], 1);
        }
        for (int i = 1; i < a.length; i++) {
            if (prev == a[i]) {
                Integer counter = map.get(a[i]);
                map.put(a[i], ++counter);
            }
            prev = a[i];
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
