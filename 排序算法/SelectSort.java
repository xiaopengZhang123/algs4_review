package Test;

import java.util.Arrays;
import java.util.Random;

public class SelectSort {
    public static void main(String[] args) {
        int[]arr=new int[2000];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int res=r.nextInt(-1000000,1000000);
            arr[i]=res;
        }
        int[] copy = arr.clone();
        selectSort(arr);
        Arrays.sort(copy);
        assert Arrays.equals(arr,copy);
        boolean equals = Arrays.equals(arr, copy);
        System.out.println(equals);
    }
    private static void selectSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(i!=min){
                swap(arr,i,min);
            }
        }
    }
    private static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
