package SortinfAlgo;
import java.util.*;

public class RadixSort {
    public static void radix_sort(int arr[], int n){
        int max=getmax(arr, n);
        for(int pos=1; max/pos>0; pos=pos*10){
            countsort(arr, n, pos);
        }
    }
    public static int getmax(int arr[], int n){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void countsort(int arr[], int n, int pos){
        int count[]=new int[n];
        int brr[]=new int[n];
        for(int i=0;i<n;i++){
            ++count[(arr[i]/pos)%10];
        }
        for(int i=1;i<=n;i++){
            count[i]=count[i]+count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            brr[--count[(arr[i]/pos)%10]]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=brr[i];
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
        radix_sort(arr, n);
        System.out.println("After sorting the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
