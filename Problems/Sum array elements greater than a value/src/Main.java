import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int maxValue = scanner.nextInt();

        int sum = 0;
        for (int item: array) {
            sum += (item > maxValue) ? item : 0;
        }

        System.out.println(sum);
    }
}