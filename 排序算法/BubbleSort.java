package Test;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr=new int[1000];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int res=r.nextInt(1000000);
            arr[i]=res;
        }
        int[] copy = arr.clone();
        bubbleSort(arr);
        Arrays.sort(copy);
        assert Arrays.equals(arr,copy);
        boolean equals = Arrays.equals(arr, copy);
        System.out.println(equals);
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    private static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
