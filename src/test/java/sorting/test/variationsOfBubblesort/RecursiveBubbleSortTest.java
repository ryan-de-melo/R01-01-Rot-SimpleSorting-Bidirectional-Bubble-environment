package sorting.test.variationsOfBubblesort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sorting.variationsOfBubblesort.RecursiveBubbleSort;

public class RecursiveBubbleSortTest {

    private Integer[] vetorTamPar;
    private Integer[] vetorTamImpar;
    private Integer[] vetorVazio = {};
    private Integer[] vetorValoresRepetidos;
    private Integer[] vetorValoresIguais;
    private Integer[] vetorTamUm;
	private Integer[] vetorDuplicata;
	private Integer[] vetorOrdenado;
    private Integer[] vetorTamDois;
    private Integer[] vetorValoresNegativos;

    private RecursiveBubbleSort<Integer> recursiveBubbleSort;

    @Before
    public void setup() {
        vetorTamPar = new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23, 31 };
        vetorTamImpar = new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36 };
		vetorValoresRepetidos = new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 };
		vetorValoresIguais = new Integer[] { 6, 6, 6, 6, 6, 6 };
		vetorTamUm = new Integer[] {1};
		vetorDuplicata = new Integer[] {1, 2, 3, 1, 2, 3};
		vetorOrdenado = new Integer[] {1, 2, 3, 4, 5};
        vetorTamDois = new Integer[] {2, 1};
        vetorValoresNegativos = new Integer[] {7, 2, -3, 8, -1, 0};

        getImplementationRecursiveBubbleSort();
    }

    private void getImplementationRecursiveBubbleSort() {
        recursiveBubbleSort = new RecursiveBubbleSort<Integer>();
    }

    // ====================

    public void genericTestRecursive(Integer[] array) {
        Integer[] copy = {};
		if(array.length > 0){
			copy = Arrays.copyOf(array, array.length);			
		}
		
        recursiveBubbleSort.sort(array);
		Arrays.sort(copy);
		Assert.assertArrayEquals(copy, array);
    }

    // === Bubble Sort Recursive

    @Test
    public void testrecursiveVetorPar() {
        genericTestRecursive(vetorTamPar);
    }

    @Test
    public void testRecursiveVetorImpar() {
        genericTestRecursive(vetorTamImpar);
    }

    @Test
    public void testRecusiveVetorVazio() {
        genericTestRecursive(vetorVazio);
    }

    @Test
    public void testRecursiveVetorRepetido() {
        genericTestRecursive(vetorValoresRepetidos);
    }

    @Test
    public void testRecursiveVetorIguais() {
        genericTestRecursive(vetorValoresIguais);
    }

    @Test
    public void testRecursiveVetorDulicata() {
        genericTestRecursive(vetorDuplicata);
    }

    @Test
    public void testrecursiveVetorTamanhoUm() {
        genericTestRecursive(vetorTamUm);
    }

    @Test
    public void testReursiveVetorOrdenado() {
        genericTestRecursive(vetorOrdenado);
    }

    @Test
    public void testRecursiveVetorTamanhoDois() {
        genericTestRecursive(vetorTamDois);
    }

    @Test
    public void testRecursiveVetorComValoresNegativos() {
        genericTestRecursive(vetorValoresNegativos);
    }

    @Test
    public void testRecursiveMeioDeArray() {
        Integer[] expected = { 6, 41, 4, 7, 26, 32, 37, 49, 11, 18, 36 };
		
        recursiveBubbleSort.sort(vetorTamImpar, 2, 6);
		Assert.assertArrayEquals(expected, vetorTamImpar);
    }
}