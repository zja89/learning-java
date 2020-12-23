package com;

import java.util.Arrays;


/**
 * @author:
 * @date: 2020/12/22
 */
public class ArrayExample {
    public ArrayExample() {
    }

    static void arr(){
        int[] ns = {0,1,2};
        System.out.println(Arrays.toString(ns));
        for (int i=0;i<ns.length;i++){
            System.out.println(ns[i]);
        }
        for (int i:ns){
            System.out.println(ns[i]);
        }
    }

    static void multiArr(){
        int[][] ns = {
                {0,1},
                {2,3}
        };
        System.out.println(Arrays.deepToString(ns));
    }
    public static void main(String[] args) {
        arr();
        multiArr();
    }
}
