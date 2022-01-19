import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);
		assertEquals(lst4, arr4.getArrayList());
		
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(20);
		arr2.add(0, 10);
		arr2.add(1, 10);
		arr2.add(1, 50);
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(20);
		lst2.add(0, 10);
		lst2.add(1, 10);
		lst2.add(1, 50);
		assertEquals(lst2, arr2.getArrayList());

		ArrayList<Integer> arr3Elements = new ArrayList<Integer>();
		arr3Elements.add(93);
		arr3Elements.add(86);
		arr3Elements.add(75);
		arr3Elements.add(85);
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr3 = new CustomIntegerArrayList(arr3Elements);
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst3.add(93);
		lst3.add(86);
		lst3.add(75);
		lst3.add(85);
		assertEquals(lst3, arr3.getArrayList());

		CustomIntegerArrayList arr5 = new CustomIntegerArrayList();
		arr5.add(10);
		arr5.add(0, 11);
		arr5.add(1, 110);
		arr5.add(1, 111);
		ArrayList<Integer> lst5 = new ArrayList<Integer>();
		lst5.add(10);
		lst5.add(0, 11);
		lst5.add(1, 110);
		lst5.add(1, 111);
		assertEquals(lst5, arr5.getArrayList());
		
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(20);
		arr2.add(0, 10);
		arr2.add(1, 10);
		arr2.add(1, 50);
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(20);
		lst2.add(0, 10);
		lst2.add(1, 10);
		lst2.add(1, 50);
		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));

		
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(20);
		arr2.add(0, 10);
		arr2.add(1, 10);
		arr2.add(1, 50);
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(20);
		lst2.add(0, 10);
		lst2.add(1, 10);
		lst2.add(1, 50);
		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 20);
		arr2.add(0, 10);
		arr2.add(1, 10);
		arr2.add(1, 50);
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 20);
		lst2.add(0, 10);
		lst2.add(1, 10);
		lst2.add(1, 50);
		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));

		 	
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);
		assertEquals((int) lst1.get(0), (int) arr1.get(0));

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 20);
		arr2.add(0, 10);
		arr2.add(1, 10);
		arr2.add(1, 50);
		arr2.add(2, 75);
		arr2.remove(3);
		arr2.remove(0);
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 20);
		lst2.add(0, 10);
		lst2.add(1, 10);
		lst2.add(1, 50);
		lst2.add(2, 75);
		lst2.remove(3);
		lst2.remove(0);
		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
		 
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		assertEquals(lst1, arr1.getArrayList());

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0, 20);
		arr2.add(0, 10);
		arr2.add(1, 10);
		arr2.add(1, 50);
		arr2.add(2, 75);
		arr2.remove(2, 10);
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0, 20);
		lst2.add(0, 10);
		lst2.add(1, 10);
		lst2.add(1, 50);
		lst2.add(2, 75);
		lst2.remove(0);
		lst2.remove(2);
		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0);
		arr2.add(0);
		arr2.add(1);
		arr2.add(1);
		arr2.add(2);
		arr2.splice(3, 2);
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0);
		lst2.add(0);
		lst2.add(1);
		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 1, new int[] { 4, 5 });
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		assertEquals(lst1, arr1.getArrayList());

		CustomIntegerArrayList arr2 = new CustomIntegerArrayList();
		arr2.add(0);
		arr2.add(0);
		arr2.add(1);
		arr2.add(1);
		arr2.add(2);
		arr2.splice(3, 2 , new int[] {45, 50});
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst2.add(0);
		lst2.add(0);
		lst2.add(1);
		lst2.add(45);
		lst2.add(50);
		assertEquals((int) lst2.get(0), (int) arr2.get(0));
		assertEquals((int) lst2.get(1), (int) arr2.get(1));
		assertEquals((int) lst2.get(2), (int) arr2.get(2));
	}

}