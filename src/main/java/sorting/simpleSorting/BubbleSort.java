package sorting.simpleSorting;

import sorting.AbstractSorting;

import static util.Util.swap;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (array == null || leftIndex < 0 || rightIndex > array.length - 1) {
			throw new RuntimeException();
		}

		boolean swapped = true;

		while (swapped) {
			swapped = false;

			// { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 }

			for (int i = leftIndex; i < rightIndex; i++) {

				if (array[i].compareTo(array[i+1]) > 0) {
					swapped = true;
					swap(array, i, i+1);
				}
			}
		}
		
	}
}
