package Sorting;
import java.util.Scanner;
public class OptimizedBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter the number of elements to sort: ");
		    int n = scanner.nextInt();

		    int[] arr = new int[n];

		    System.out.println("Enter the elements: ");
		    for (int i = 0; i < n; i++) {
		      arr[i] = scanner.nextInt();
		    }

		    // Perform Optimized BubbleSort sort
		   OptimizedBubbleSort(arr);

		    System.out.println("Optimized BubbleSorted array: ");
		    for (int i : arr) {
		      System.out.print(i + " ");
		    }
		    System.out.println();
		  }

		  public static void OptimizedBubbleSort(int[] arr) {
		    int n = arr.length;
		    boolean swapped = true; // Flag to track if any swaps occurred

		    for (int i = 0; i < n - 1 && swapped; i++) {
		      swapped = false; // Reset flag for each pass

		      for (int j = 0; j < n - i - 1; j++) {
		        if (arr[j] > arr[j + 1]) {
		          int temp = arr[j];
		          arr[j] = arr[j + 1];
		          arr[j + 1] = temp;
		          swapped = true; // Set flag if a swap occurred
		        }
		      }
		    }
	}

}
       
