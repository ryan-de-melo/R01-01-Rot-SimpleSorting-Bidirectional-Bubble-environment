package sorting.variationsOfSelectionsort;

import static util.Util.swap;

import sorting.AbstractSorting;

public class RecursiveSelectionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementação recursiva do selection sort. Você deve implementar apenas
	 * esse método sem usar nenhum outro método auxiliar (exceto
	 * Util.swap(array,int,int)). Para isso, tente definir o caso base do
	 * algoritmo e depois o caso indutivo, que reduz o problema para uma entrada
	 * menor em uma chamada recursiva. Seu algoritmo deve ter complexidade
	 * quadrática O(n^2).
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (!(array == null || leftIndex < 0 || rightIndex > array.length - 1 || array.length == 0)) {

			if (leftIndex != rightIndex) {
				int pointerOfMin = leftIndex;
	
				for (int i = leftIndex; i <= rightIndex; i++) {
					if (array[pointerOfMin].compareTo(array[i]) > 0) {
						pointerOfMin = i;
					}
				}
				swap(array, leftIndex, pointerOfMin);
	
				sort(array, leftIndex+1, rightIndex);
			}


		}
	}
}
