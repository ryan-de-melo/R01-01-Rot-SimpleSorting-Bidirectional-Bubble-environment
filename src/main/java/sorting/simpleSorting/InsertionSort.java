package sorting.simpleSorting;

import sorting.AbstractSorting;

import static util.Util.swap;

/**
 * As the insertion sort algorithm iterates over the array, it makes the
 * assumption that the visited positions are already sorted in ascending order,
 * which means it only needs to find the right position for the current element
 * and insert it there.
 */
public class InsertionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (!(array == null || leftIndex < 0 || rightIndex > array.length - 1 || array.length == 0)) {

			for (int i = leftIndex + 1; i < rightIndex + 1; i++) {
				T key = array[i];
				int j = i - 1;
	
				while (j >= 0 && key.compareTo(array[j]) < 0) {
					swap(array, i--, j--);
				}
	
			} 
		}
	}
}
