package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;

import static util.Util.swap;

/**
 * This bubble sort variation has two internal iterations. In the first, it
 * pushes big elements to the right, like the normal bubble sort does. Then in
 * the second, iterates the array backwards, that is, from right to left, while
 * pushing small elements to the left. This process is repeated until the array
 * is sorted.
 */
public class BidirectionalBubbleSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (!(array == null || leftIndex < 0 || rightIndex > array.length - 1 || array.length == 0)) {

			boolean swapped = true;

			while (swapped && leftIndex < rightIndex) {
				
				swapped = false;

				for (int i = leftIndex; i < rightIndex; i++) {

					if (array[i].compareTo(array[i+1]) > 0) {
						swap(array, i, i+1);
						swapped = true;
					}
				}

				rightIndex--;
				
				for (int k = rightIndex; k > leftIndex; k--) {
					
					if (array[k].compareTo(array[k-1]) < 0) {
						swap(array, k-1, k);
						swapped = true;
					}
					
				}

				leftIndex++;
			}
		}
	}
}
