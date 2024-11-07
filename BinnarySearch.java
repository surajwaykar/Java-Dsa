import java.util.Scanner;

public class BinnarySearch{
    public static int binnarySearch(int [] arr , int key){
        int left = 0 ,right = arr.length -1, mid;

        while( left <= right) {
        mid = left +right /2;
        if(arr[mid] == key){
           return mid;
        }
        if( key < arr[mid]){
            right = mid -1;
        }
        else{
            left = mid +1 ;
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = {12,16, 23 , 34, 56,57,78,90,100};
        System.out.println("Enter the key ");
		int key=scanner.nextInt();
		int index = binnarySearch(arr ,key);
		if(index == -1) {
			System.out.println("Key Not Found");
			
		}else {
			System.out.println("Key Found at Index "+index);
			
		}

        scanner.close();  
    }
}