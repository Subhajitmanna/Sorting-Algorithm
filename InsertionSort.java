package SortinfAlgo;
import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        int subarr, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            subarr = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > subarr; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = subarr;
        }
        System.out.println("After sorting the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}