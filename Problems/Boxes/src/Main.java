import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] boxA = new int[3];
        int[] boxB = new int[3];
        for (int i = 0; i < 3; i++) {
            boxA[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            boxB[i] = scanner.nextInt();
        }
        Arrays.sort(boxA);
        Arrays.sort(boxB);

        String result = "Incomparable";

        if (Arrays.equals(boxA, boxB)) {
            result = "Box 1 = Box 2";
        } else if (boxA[0] <= boxB[0] && boxA[2] <= boxB[2]) {
            result = "Box 1 < Box 2";
        } else if (boxA[0] >= boxB[0] && boxA[2] >= boxB[2]) {
            result = "Box 1 > Box 2";
        }

        System.out.println(result);
    }
}