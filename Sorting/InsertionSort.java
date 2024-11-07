package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int []arr ){
        //n-1 passes in each pass consider ith element as last element of array
        for(int i=1;i < arr.length; i++){
        //copy last element in temp
        int j, temp =arr[i];
        //compare temp with all the elements before that , find the appropriate position for the element and insert the temp in that postion.  
        for(  j=i-1; j>=0  && arr[j] > temp ;j--){
            arr[j+1]=arr[j];
        }
        arr[j+1]=temp;
    }

    }

    public static void main(String[] args) {
        	int []arr = {5,3,2,9,6,1};
	  System.out.println("Before " + Arrays.toString(arr));
	  insertionSort(arr);
	  System.out.println("Before " + Arrays.toString(arr));
	  

        
    }
    
}
