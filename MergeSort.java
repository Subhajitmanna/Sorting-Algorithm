package SortinfAlgo;
import java.util.*;

public class MergeSort {
    public static void merge_sort(int arr[], int l, int r){
        if(l<r){
            int mid =(l+r)/2;
            merge_sort(arr, l, mid);
            merge_sort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    public static void merge(int arr[], int l, int mid, int r){
        int brr[]=new int [r+1];
        int i=l;
        int j=mid+1;
        int k=l;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                brr[k]=arr[i];
                i++;
            }
            else{
                brr[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r){
                brr[k]=arr[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid){
                brr[k]=arr[i];
                i++;
                k++;
            }
        }
        for(k=l;k<=r;k++){
            arr[k]=brr[k];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        merge_sort(arr, 0, n-1);
        System.out.println("After sorting the array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
