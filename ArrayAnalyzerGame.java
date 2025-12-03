package com.code;

import java.util.*;
public class ArrayAnalyzerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int [size];
        for (int i = 0; i< size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum element in the given array is : "+maxArray(arr));
        System.out.println("Minimum element in the given array is : "+minArray(arr));
        System.out.println("Sum of the given array is : "+addition(arr));
        System.out.println("Average of the given array is : "+average(arr));
        System.out.println("Second largest number of the given array is : "+secondLargest(arr));
        int[] reversed = reverseArray(arr);
        System.out.println("Reverse of the given array is : "+Arrays.toString(reversed));
        frequencyCount(arr);
    }
    public  static int maxArray(int[] arr){
        int max  = arr[0];
        for (int i =0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minArray(int[] arr){
        int min = arr[0] ;
        for (int i =0; i< arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int addition(int[] arr){
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static double average(int[] arr) {
        return (double) addition(arr) / arr.length;
    }
    public static int secondLargest(int[] arr){
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int n = copy.length;

        for (int i = n - 2; i >= 0; i--){
            if (copy[i] != copy[n - 1]){
                return copy[i];
            }
        }
        return -1;
    }
    public static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[n - 1 - i];
        }
        return ans;
    }
    public static void frequencyCount(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}
