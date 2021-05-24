import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        while (true) {
            int[] array = {4, 23, 5, 786, 342, 465, 65, 56, 100, 438, 576};
            Arrays.sort(array);
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
            int left = 0;
            int right = array.length;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap gia tri can tim");
            int value = scanner.nextInt();
            int index = binarySearch(array, left, right, value);
            if (index == -1) {
                System.out.println("Gia tri can tim khong nam trong mang");
            } else {
                System.out.println("Gia tri " + value + " nam o vi tri " + index);
            }
        }
    }

    static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value)
                return mid;
            if (value > array[mid])
                return binarySearch(array, mid + 1, right, value);
            return binarySearch(array, left, mid - 1, value);
        }
        return -1;
    }
}
