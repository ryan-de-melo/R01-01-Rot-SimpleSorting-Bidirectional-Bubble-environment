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

		if (!(array == null || leftIndex < 0 || rightIndex > array.length - 1 || array.length == 0)) {
			int pointerOfMin;

			for (int i = leftIndex; i < rightIndex + 1; i++) {
				pointerOfMin = i;

				for (int j = i + 1; j <= rightIndex; j ++) {

					if (array[j].compareTo(array[pointerOfMin]) < 0) {
						pointerOfMin = j;
					}
				}

				swap(array, i, pointerOfMin);
			}
		}
	}

}
