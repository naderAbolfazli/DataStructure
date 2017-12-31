package ir.maktab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nader on 12/30/2017.
 */
public class TestDeque {
    Deque<Integer> deque;

    @Before
    public void init() {
        deque = new Deque<>();
    }

    @Test
    public void testPush() {
        assertTrue(deque.isEmpty());
        deque.pushFront(5);
        deque.pushFront(2);
        deque.pushFront(3);
        deque.pushFront(7);
        deque.pushBack(1);
        deque.pushBack(4);
        deque.pushBack(9);
        deque.pushBack(6);

        assertFalse(deque.isEmpty());
        assertTrue(deque.contains(3));
        assertFalse(deque.contains(8));
        assertEquals(8, deque.size());
    }

    @Test
    public void testPopFront() {
        deque.pushFront(5);
        deque.pushFront(2);
        deque.pushFront(3);
        deque.pushFront(7);
        deque.pushBack(1);
        deque.pushBack(4);
        deque.pushBack(9);
        deque.pushBack(6);

        assertEquals((Integer) 7, deque.front());
        assertTrue(deque.contains(7));
        assertEquals((Integer) 7, deque.popFront());
        assertFalse(deque.contains(7));

        deque.clear();
        try {
            deque.popFront();
            fail();
        }catch (UnderflowException e){
            assertEquals("Deque Underflow Exception", e.getMessage());
        }
    }

    @Test
    public void testPopBack() {
        deque.pushFront(5);
        deque.pushFront(2);
        deque.pushFront(3);
        deque.pushFront(7);
        deque.pushBack(1);
        deque.pushBack(4);
        deque.pushBack(9);
        deque.pushBack(6);

        assertEquals((Integer) 6, deque.back());
        assertTrue(deque.contains(6));
        assertEquals((Integer) 6, deque.popBack());
        assertFalse(deque.contains(6));

        deque.clear();
        try {
            deque.popBack();
            fail();
        }catch (UnderflowException e){
            assertEquals("Deque Underflow Exception", e.getMessage());
        }
    }

}
