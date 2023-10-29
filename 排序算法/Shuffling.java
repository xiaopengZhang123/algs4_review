package SortAlgos;

import edu.princeton.cs.algs4.StdRandom;

public class Shuffling {
    /*洗牌的意思*/
    public static void main(String[] args) {
        int[]arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        for (int i = 0; i < arr.length; i++) {
            //洗牌是与0-i之间的数进行交换，不是在0-n之间进行交换
            int j = StdRandom.uniformInt(i + 1);
            swap(arr,i,j);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
