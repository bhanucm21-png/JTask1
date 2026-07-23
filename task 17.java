import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int min = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] - min > maxDiff)
                maxDiff = arr[i] - min;

            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println(maxDiff);
    }
}
