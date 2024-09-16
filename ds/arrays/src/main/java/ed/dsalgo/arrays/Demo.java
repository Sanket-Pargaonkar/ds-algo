package ed.dsalgo.arrays;

import ed.dsalgo.arrays.*;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class Demo {
	public static void main(String[] args) {
		DynamicArray da = new DynamicArray(10);
		try {
			System.out.println("Inserting 3 elements");
			da.insert(0, 1);
			da.insert(1, 2);
			da.insert(2, 3);
			da.traverse();
			System.out.println("Traversing 3  elements");
			da.traverse(0, 2);
			System.out.println("Inserting 1 element that is out of bound");
			da.insert(10, 11);
			da.traverse();
			System.out.println("Reading 11th  element");
			System.out.println(da.read(10));
			System.out.println("Reading 11th  element: 11");
			System.out.println(da.search(10));
			System.out.println("Reading element: 7");
			System.out.println(da.search(7));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
