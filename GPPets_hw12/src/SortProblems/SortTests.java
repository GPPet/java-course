package SortProblems;

public class SortTests {

	public static void main(String[] args) {
		// The package includes Problem2, p.14; Problem3, p. 17; & Problem4, p. 19 (actual homework)
		
		System.out.print("Initial array:\t");
		int[] testArr =  {9,109,357,2,38,5,3,9,0,3,2,7,34,67};
		for(Integer i : testArr) System.out.print(i + " ");
		System.out.println();
		
		System.out.print("BucketSorted array:\t");
		int[] bucket = {9,109,357,2,38,5,3,9,0,3,2,7,34,67};
		BucketSort.bucketSort(bucket);;
		for(Integer i : bucket) System.out.print(i + " ");
		System.out.println();
		
		System.out.print("BubbleSorted array:\t");
		int[] bubble = {9,109,357,2,38,5,3,9,0,3,2,7,34,67};
		BubbleSort.bubbleSort(bubble);
		for(Integer i : bubble) System.out.print(i + " ");
		System.out.println();
		
		System.out.print("MergeSorted array:\t");
		int[] merge = {9,109,357,2,38,5,3,9,0,3,2,7,34,67};
		MergeSort.sort(merge);
		for(Integer i : merge) System.out.print(i + " ");
		System.out.println();
		
		System.out.print("QuickSorted array:\t");
		int[] quick = {9,109,357,2,38,5,3,9,0,3,2,7,34,67};
		QuickSort.quickSort(quick, 0, quick.length-1);
		for(Integer i : quick) System.out.print(i + " ");
		System.out.println();
		
		
		
	}

}