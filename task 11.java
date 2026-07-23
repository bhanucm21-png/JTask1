import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate)
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
