package sorting.test.variationsOfBubblesort;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sorting.variationsOfBubblesort.BidirectionalBubbleSort;

public class BidirectionalBubbleSortTest {

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


    private BidirectionalBubbleSort<Integer> bidirectionalBubbleSort;

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

        getImplementationBubbleSort();
    }

    private void getImplementationBubbleSort() {
        bidirectionalBubbleSort = new BidirectionalBubbleSort<Integer>();
    }

    // ====================

    public void genericTestNormal(Integer[] array) {
		Integer[] copy = {};
		if(array.length > 0){
			copy = Arrays.copyOf(array, array.length);			
		}
		
        bidirectionalBubbleSort.sort(array);
		Arrays.sort(copy);
		Assert.assertArrayEquals(copy, array);
	}

    @Test
    public void testNormalVetorPar() {
        genericTestNormal(vetorTamPar);
    }

    @Test
    public void testNormalVetorImpar() {
        genericTestNormal(vetorTamImpar);
    }

    @Test
    public void testNormalVetorVazio() {
        genericTestNormal(vetorVazio);
    }

    @Test
    public void testNormalVetorRepetido() {
        genericTestNormal(vetorValoresRepetidos);
    }

    @Test
    public void testNormalVetorIguais() {
        genericTestNormal(vetorValoresIguais);
    }

    @Test
    public void testNormalVetorDulicata() {
        genericTestNormal(vetorDuplicata);
    }

    @Test
    public void testNormalVetorTamanhoUm() {
        genericTestNormal(vetorTamUm);
    }

    @Test
    public void testNormalVetorOrdenado() {
        genericTestNormal(vetorOrdenado);
    }

    @Test
    public void testNormalVetorTamanhoDois() {
        genericTestNormal(vetorTamDois);
    }

    @Test
    public void testNormalVetorComValoresNegativos() {
        genericTestNormal(vetorValoresNegativos);
    }

    @Test
    public void testNormalMeioDeArray() {
        Integer[] expected = { 6, 41, 4, 7, 26, 32, 37, 49, 11, 18, 36 };
		
        bidirectionalBubbleSort.sort(vetorTamImpar, 2, 6);
		Assert.assertArrayEquals(expected, vetorTamImpar);
    }

}
