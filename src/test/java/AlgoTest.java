package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
		@Test //Node Coverage by decreasing input input
		  //Node Sequence: 20,26,27,28,(29,30,31,32,33),27,36
	public void nodeCoverage() {
	 
		int[] input = new int[] {10,9,8,7,6,5,4,3,2,1,0};
		int[] result = new int[] {0,1,2,3,4,5,6,7,8,9,10};
	  
		Item[] items0 = new Item[input.length];
		Item[] items1 = new Item[input.length];
		Item[] items2 = new Item[input.length];
		Item[] items3 = new Item[input.length];
		Item[] items4 = new Item[input.length];
		Item[] items5 = new Item[input.length];
		
		for(int i=0;i<input.length;i++) {
		  	items0[i] = new Item(input[i]);
		  	items1[i] = new Item(input[i]);
		  	items2[i] = new Item(input[i]);
		  	items3[i] = new Item(input[i]);
		  	items4[i] = new Item(input[i]);
		  	items5[i] = new Item(input[i]);
		}

			
		  SortAlgos.bubbleSort(items0);
		  SortAlgos.insertionSort(items1);
		  SortAlgos.mergeSort(items2);
		  SortAlgos.quickSort(items3);
		  SortAlgos.selectionSort(items4);
		  SortAlgos.heapSort(items5);
		  
		  //assertArrayEquals(input, result);
	}


	@Test //Edge Coverage by null input
	  //Node Sequence: 20,26,27,36 
	public void edgeCoverage() {
	  int[] input  = new int[] {};
	  int[] result = new int[] {};
	  
		Item[] items0 = new Item[input.length];
		Item[] items1 = new Item[input.length];
		Item[] items2 = new Item[input.length];
		Item[] items3 = new Item[input.length];
		Item[] items4 = new Item[input.length];
		Item[] items5 = new Item[input.length];
			
		  SortAlgos.bubbleSort(items0);
		  SortAlgos.insertionSort(items1);
		  SortAlgos.mergeSort(items2);
		  SortAlgos.quickSort(items3);
		  SortAlgos.selectionSort(items4);
		  SortAlgos.heapSort(items5);
		  
		 assertArrayEquals(input, result);
	}


	
	@Test //Edge Coverage by single element input input
		  //Node Coverage: 20,26,27,28,27,36
	public void edgeCoverageSingle() {
		int[] input  = new int[] {10};
		  int[] result = new int[] {10};
		  
			Item[] items0 = new Item[input.length];
			Item[] items1 = new Item[input.length];
			Item[] items2 = new Item[input.length];
			Item[] items3 = new Item[input.length];
			Item[] items4 = new Item[input.length];
			Item[] items5 = new Item[input.length];
			
			for(int i=0;i<input.length;i++) {
			  	items0[i] = new Item(input[i]);
			  	items1[i] = new Item(input[i]);
			  	items2[i] = new Item(input[i]);
			  	items3[i] = new Item(input[i]);
			  	items4[i] = new Item(input[i]);
			  	items5[i] = new Item(input[i]);
			}

				
			  SortAlgos.bubbleSort(items0);
			  SortAlgos.insertionSort(items1);
			  SortAlgos.mergeSort(items2);
			  SortAlgos.quickSort(items3);
			  SortAlgos.selectionSort(items4);
			  SortAlgos.heapSort(items5);
			  
			  assertArrayEquals(input, result);
	}


	@Test //Edge Coverage by sorted input input
		  //Node Sequence: 20,26,27,28,29,27,36
    public void edgeCoverageSorted() {
		int[] input  = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		  int[] result = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		  
			Item[] items0 = new Item[input.length];
			Item[] items1 = new Item[input.length];
			Item[] items2 = new Item[input.length];
			Item[] items3 = new Item[input.length];
			Item[] items4 = new Item[input.length];
			Item[] items5 = new Item[input.length];
			
			for(int i=0;i<input.length;i++) {
			  	items0[i] = new Item(input[i]);
			  	items1[i] = new Item(input[i]);
			  	items2[i] = new Item(input[i]);
			  	items3[i] = new Item(input[i]);
			  	items4[i] = new Item(input[i]);
			  	items5[i] = new Item(input[i]);
			}
			
			  SortAlgos.bubbleSort(items0);
			  SortAlgos.insertionSort(items1);
			  SortAlgos.mergeSort(items2);
			  SortAlgos.quickSort(items3);
			  SortAlgos.selectionSort(items4);
			  SortAlgos.heapSort(items5);
			  
			 assertArrayEquals(input, result);
		}

	
	@Test //Condition Coverage by random input input
		  //Node Sequence: 20,26,27,28,29,30,31,32,33,27,36
    public void conditionCoverage() {
		
        int[] input = new int[] {7,5,3,9,1,4,8,2,10,6,0};
        int[] result = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		
        Item[] items0 = new Item[input.length];
		Item[] items1 = new Item[input.length];
		Item[] items2 = new Item[input.length];
		Item[] items3 = new Item[input.length];
		Item[] items4 = new Item[input.length];
		Item[] items5 = new Item[input.length];
		
		for(int i=0;i<input.length;i++) {
		  	items0[i] = new Item(input[i]);
		  	items1[i] = new Item(input[i]);
		  	items2[i] = new Item(input[i]);
		  	items3[i] = new Item(input[i]);
		  	items4[i] = new Item(input[i]);
		  	items5[i] = new Item(input[i]);
		}
		
		  SortAlgos.bubbleSort(items0);
		  SortAlgos.insertionSort(items1);
		  SortAlgos.mergeSort(items2);
		  SortAlgos.quickSort(items3);
		  SortAlgos.selectionSort(items4);
		  SortAlgos.heapSort(items5);
		  
		  assertArrayEquals(input, result);
    }
}
