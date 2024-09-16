package ed.dsalgo.arrays;

import ed.CustomExceptions.WrongInsertPositionException;
import java.lang.System;
import java.util.NoSuchElementException;

public class DynamicArray {
	private int size;
	private int capacity;
	private static final int OFFSET = 5;
	public static final int DEFAULT_CAPACITY = 5;
	private int[] array;

	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new int[capacity];
	}

	public DynamicArray() {
		this.capacity = DEFAULT_CAPACITY;
		this.array = new int[capacity];
	}

	// traverse
	public void traverse() {
		System.out.println("\nPrinting all the " + this.array.length + " elements of the \n");
		for (int i = 0; i < this.array.length; i++) {
			System.out.print(this.array[i]);
			if (i < this.array.length - 1)
				System.out.print(",");
		}
		System.out.print("\n");
	}

	public void traverse(int start, int end) {
		if (start < 0) {
			throw new IllegalArgumentException("Start position in the array cannot be less than 0");
		}
		if (end > this.array.length - 1) {
			throw new IllegalArgumentException(
					"End position in the array cannot be greater than  length of the array:"
							+ this.array.length + " 0");
		}

		System.out.println("\nPrinting all the " + this.array.length + " elements of the ");
		for (int i = start; i <= end; i++) {
			System.out.print(this.array[i]);
			if (i < end)
				System.out.print(",");
		}
		System.out.print("\n");

	}

	// insert
	public void insert(int pos, int i) {

		if (pos < 0) {
			throw new IllegalArgumentException(
					"insert position in the array should be greater than or equal to 0");
		}

		if (pos > this.array.length - 1) {
			System.out.println("\n");
			System.out.println("Array capacity reached. Increasing capacity by default inc_offset: " + OFFSET);
			System.out.println("\n");
			int[] temp = new int[this.array.length + OFFSET];
			for (int j = 0; j < this.array.length; j++)
				temp[j] = this.array[j];
			this.array = temp;
		}

		this.array[pos] = i;
	}

	// read
	public int read(int pos) {
		System.out.println("\n");
		if (pos < 0) {
			throw new IllegalArgumentException(
					"insert position in the array should be greater than or equal to 0");
		}
		if (pos > this.array.length - 1) {
			throw new IllegalArgumentException(
					"insert position in the array should be less than the length of the array : " + this.array.length);
		}
		return this.array[pos];
	}

	// update
	public void update(int pos, int val) {
		System.out.println("\n");
		if (pos < 0) {
			throw new IllegalArgumentException(
					"update position in the array should be greater than or equal to 0");
		}
		if (pos > this.array.length - 1) {
			throw new IllegalArgumentException(
					"update position in the array should be less than the length of the array : " + this.array.length);
		}
		this.array[pos] = val;
	}

	// delete
	public void delete(int pos) {
		System.out.println("\n");
		if (pos < 0) {
			throw new IllegalArgumentException(
					"delete position in the array should be greater than or equal to 0");
		}
		if (pos > this.array.length - 1) {
			throw new IllegalArgumentException(
					"delete position in the array should be less than the length of the array : " + this.array.length);
		}
		this.array[pos] = 0;
	}

	// sort
	public void sort() {

	}

	// search
	public int search(int val) {
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == val)
				return i;
		}
		throw new NoSuchElementException(val + " not found in the array");

	}
}
