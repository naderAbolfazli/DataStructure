package ir.maktab;

import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by Nader on 12/29/2017.
 */
public class TestBST {
    BST<Integer> bst;

    @Before
    public void init(){
        bst = new BST<>();
    }

    @Test
    public void testContainsClearIsEmpty(){
        assertTrue(bst.isEmpty());
        bst.add(5);
        bst.add(6);
        assertFalse(bst.isEmpty());
        assertTrue(bst.contains(6));
        assertFalse(bst.contains(3));
        bst.clear();
        assertTrue(bst.isEmpty());
    }

    @Test
    public void testAddSize(){
        bst.add(5);
        bst.add(2);
        bst.add(3);
        bst.add(7);
        bst.add(1);
        bst.add(4);
        bst.add(9);
        bst.add(6);
        assertEquals(8, bst.size());
        bst.clear();
    }

    @Test
    public void testMinMax(){
        bst.add(5);
        bst.add(2);
        bst.add(3);
        bst.add(7);
        bst.add(1);
        bst.add(4);
        bst.add(9);
        bst.add(6);
        assertEquals((Integer)1 ,bst.getMinElement());
        assertEquals((Integer)9 , bst.getMaxElement());
    }
}
