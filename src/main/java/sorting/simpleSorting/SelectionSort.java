package sorting.simpleSorting;

import static util.Util.swap;

import sorting.AbstractSorting;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// TODO: Falta implementar!!!
		if (!(array == null || leftIndex < 0 || rightIndex > array.length - 1)) {

			boolean swapped = true;

			int indexOfSmallest = findIndexOfSmallest(array, leftIndex, rightIndex);

			while (swapped) {

				swapped = false;

				for (int i = leftIndex; i < rightIndex; i++) {

				}
			}


		}

	}


	public int findIndexOfSmallest(T[] array, int leftIndex, int rightIndex) {

		int resultIndex = leftIndex;

		for (int i = leftIndex; i < rightIndex; i++) {
			
			if (array[i].compareTo(array[leftIndex]) < 0) {
				resultIndex = i;
			}
		}

		return resultIndex;
	}
}
