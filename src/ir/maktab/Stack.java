package ir.maktab;

import java.util.LinkedList;

/**
 * Created by Nader on 12/28/2017.
 */
public class Stack<E> implements Collection<E> {
    LinkedList<E> data;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        data = new LinkedList<>();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(E var) {
        return data.contains(var);
    }

    public int getMaxSize() {
        return maxSize;
    }

    public E get(int i) {
        if (i >= maxSize)
            throw new IndexOutOfBoundsException();
        return data.get(i);
    }

    public void resize(int newSize) {
        maxSize = newSize;
        if (newSize<maxSize)
            for (int i=newSize; i<maxSize; data.remove(i++));
    }

    public void push(E var) {
        if (size() == maxSize)
            throw new OverflowException("Stack Overflow Exception");
        data.add(var);
    }

    public E top() {
        if (size() == 0)
            return null;
        return data.getLast();
    }

    public E pop() {
        if (size() == 0)
            throw new UnderflowException("Stack Underflow Exception");
        return data.removeLast();
    }
}
