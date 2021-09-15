/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author idont
 */
import java.io;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<Integer>(List.of(13,4,9,6,5));
        //Scanner input = new Scanner(System.in);
        Quicksort(arr, 0, arr.size()-1);
        System.out.print(arr);
        
    }
    
    public static int Partition(ArrayList<Integer> arr, int low, int high){
        int i=low, j;    
        for(j=i;j<high;j++){
            if(arr.get(j) < arr.get(high)){
                swap(arr, (i), (j));
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }
    
    public static void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    
    public static void Quicksort(ArrayList<Integer> arr, int low, int high){
        if(low<high){
            int p= Partition(arr, low, high);//pivot
            Quicksort(arr, low, p-1);//left side
            Quicksort(arr, p+1, high);//right side
            }
    }   
}



