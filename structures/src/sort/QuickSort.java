package sort;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int[] array = {20, 35, -15, 7, 55, 1, -22};
				
		quickSort(array, 0, array.length);
		
		for (int i: array) {
			System.out.println(i);
		}
	}
	
	public static void quickSort(int[] input, int start, int end) {
		
		if (end - start < 2) {
			return;
		}
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	
		
	}
	
	public static int partition(int[] input, int start, int end) {
		
		//This is using the first element as the pivot
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while (i < j) {
			
			//NOTE: empty loop body
			while (i < j && input[--j] >= pivot);
			if (i < j) {
				input[i] = input[j];
			}
			
			while (i < j && input[++i] <= pivot);
			if (i < j) {
				input[j] = input[i];
			}
		}
		
		input[j] = pivot;
		return j;
		
	}

}
