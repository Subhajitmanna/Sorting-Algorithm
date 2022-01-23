package SortinfAlgo;
import java.util.*;

public class QuickSort {
    public static int partition(int arr[], int l, int h){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            int temp=arr[j];
            arr[j]=arr[l];
            arr[l]=temp;
        }
        return j;
    }
    public static void quick_sort(int arr[], int l, int h){
        if(l<h){
            int pivot=partition(arr, l, h);
            quick_sort(arr, l, pivot-1);
            quick_sort(arr, pivot+1, h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quick_sort(arr, 0, n-1);
        System.out.println("After sorting the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
