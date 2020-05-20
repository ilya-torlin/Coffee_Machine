import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int[] sortArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int number = scanner.nextInt();
            array[i] = number;
            sortArray[i] = number;
        }
        Arrays.sort(sortArray);

        System.out.println((Arrays.equals(sortArray, array)));
    }
}