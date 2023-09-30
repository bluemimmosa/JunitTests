package com.niraj;

public class SortingAlgo {

    public int[] sort(int[] src, int len){
        for(int i = 0; i<len-1; i++){
            for(int j = i+1; j<len; j++){
                if(src[i]>src[j]){
                    int temp = src[i];
                    src[i] = src[j];
                    src[j] = temp;
                }
            }
        }
        return src;
    }
}
