package Test;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        int[]arr=new int[5000];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int res=r.nextInt(-100000,1000000);
            arr[i]=res;
        }
        int[] copy = arr.clone();
        insertSort2(arr);
        Arrays.sort(copy);
        assert Arrays.equals(arr,copy);
        boolean equals = Arrays.equals(arr, copy);
        System.out.println(equals);
    }

    /**
     *
     * @param arr
     * 这种方法感觉更好理解
     */
    public static void insertSort1(int[]arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            while(j>=0&&arr[j]>arr[j+1]){
                swap(arr,j,j+1);
                j--;
            }
        }
    }

    private static void insertSort2(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            //arr[i]是我们当前看到的数
            //所以我们要根之前最后的那个数arr[j]比较一下，找到插入位置
            int key=arr[i];
            while(j>=0&&arr[j]>key){
                //腾位置
                arr[j+1]=arr[j];
                j--;
            }
            //插入
            arr[j+1]=key;
        }
    }

    private static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
