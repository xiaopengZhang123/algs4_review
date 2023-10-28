package Test;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr=new int[5000];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int res=r.nextInt(-100000,1000000);
            arr[i]=res;
        }
        int[] copy = arr.clone();
        int[]help=new int[arr.length];
        mergeSort(arr,help,0,arr.length-1);
        Arrays.sort(copy);
        assert Arrays.equals(arr,copy);
        boolean equals = Arrays.equals(arr, copy);
        System.out.println(equals);
    }

    private static void mergeSort(int[] arr,int[]help,int l,int h) {
        if(l>=h){
            return;
        }
        int m=(l+h)/2;
        int k=m+1;
        int s=l;
        mergeSort(arr,help,l,m);
        mergeSort(arr,help,m+1,h);
        int n=0;
        while(s<=m&&k<=h){
            if(arr[s]<=arr[k]){
                //先放arr[l]
                help[n++]=arr[s++];
            }else{
                help[n++]=arr[k++];
            }
        }
        //拷贝剩下的
        while(s<=m){
            help[n++]=arr[s++];
        }
        while(k<=h){
            help[n++]=arr[k++];
        }
        //拷贝回去
        for(int i=l,j=0;i<=h;i++){
            arr[i]=help[j++];
        }

    }
}
