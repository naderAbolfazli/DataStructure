package ir.maktab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nader on 12/29/2017.
 */
public class TestStack {
    Stack<Integer> stack;

    @Before
    public void init() {
        stack = new Stack<>(8);
    }

    @Test
    public void testAdd() {
        assertTrue(stack.isEmpty());

        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(6);

        assertEquals(8, stack.size());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testClearContains(){
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(6);

        assertTrue(stack.contains(3));
        assertFalse(stack.contains(8));
        stack.clear();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackOverflow(){
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(6);

        try {
            stack.push(8);
            fail();
        }catch (OverflowException e){
            assertEquals("Stack Overflow Exception", e.getMessage());
        }
    }

    @Test
    public void testPop(){
        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(4);
        stack.push(9);
        stack.push(6);

        assertEquals((Integer) 6, stack.top());
        assertTrue(stack.contains(6));
        assertEquals((Integer)6, stack.get(7));
        assertEquals((Integer) 6, stack.pop());
        assertFalse(stack.contains(6));
        stack.clear();
        try {
            stack.pop();
            fail();
        }catch (UnderflowException e){
            assertEquals("Stack Underflow Exception", e.getMessage());
        }
    }
}
