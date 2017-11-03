package week5;

import java.util.Arrays;

public class ArraysExerc {

    private int[] vector;
    private int numElements;

    public ArraysExerc() {

	this.vector = new int[1];
	this.numElements = this.vector.length;
    }

    public ArraysExerc(int numElem) {

	this.vector = new int[numElem];
	this.numElements = numElem;

    }

    public ArraysExerc(int[] vet) {

	this.vector = new int[vet.length];
	this.numElements = vet.length;
	for (int i = 0; i < vet.length; i++) {
	    this.vector[i] = vet[i];
	}

    }

    public void setNumElements(int arrayIndex) {

	this.numElements = arrayIndex;
    }

    public int[] getVector() {

	return this.vector;
    }

    public void setVector(int[] sumArray) {

	this.vector = sumArray;
    }

    public void valAdd(int index, int val) {

	this.vector[index] = val;
    }

    public ArraysExerc somaArray(ArraysExerc array2) {

	ArraysExerc somaArray = new ArraysExerc(this.vector.length);
	if (!(this.vector.length == array2.vector.length)) {
	    throw new IllegalArgumentException("Dimensões diferentes");
	}
	for (int index = 0; index < this.vector.length; index++) {
	    somaArray.vector[index] = array2.vector[index] + this.vector[index];
	}

	return somaArray;

    }

    public ArraysExerc bubbleSort() throws Exception {

	ArraysExerc bubbleSortArray = new ArraysExerc(this.vector);

	int aux;
	boolean flag = true;

	while (flag) {
	    flag = false;
	    if (bubbleSortArray.vector.length < 2) {
		throw new Exception();
	    }

	    for (int j = 0; j < (this.vector.length - 1); j++) {
		if (bubbleSortArray.vector[j] > bubbleSortArray.vector[j + 1]) {
		    aux = this.vector[j];
		    bubbleSortArray.vector[j] = bubbleSortArray.vector[j + 1];
		    bubbleSortArray.vector[j + 1] = aux;
		    flag = true;
		}
	    }
	}

	return bubbleSortArray;
    }

    public int getNumElements() {

	return this.numElements;
    }

    @Override
    public boolean equals(Object obj) {

	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	ArraysExerc other = (ArraysExerc) obj;
	if (!Arrays.equals(this.vector, other.vector)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {

	return "ArrayExercises [vector=" + Arrays.toString(this.vector) + ", arrayIndex=" + this.numElements + "]";
    }

}
