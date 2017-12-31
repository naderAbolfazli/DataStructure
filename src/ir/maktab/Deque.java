package ir.maktab;

import java.util.LinkedList;

/**
 * Created by Nader on 12/28/2017.
 */
public class Deque<E> implements Collection<E> {
    LinkedList<E> data;

    public Deque() {
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

    public void pushFront(E var) {
        data.addFirst(var);
    }

    public void pushBack(E var) {
        data.add(var);
    }

    public E front() {
        return data.getFirst();
    }

    public E back() {
        return data.getLast();
    }

    public E popFront() {
        if (size()==0)
            throw new UnderflowException("Deque Underflow Exception");
        return data.pop();
    }

    public E popBack() {
        if (size()==0)
            throw new UnderflowException("Deque Underflow Exception");
        E res = data.getLast();
        data.removeLast();
        return res;
    }

    public E getElement(int i){
        if (i>=size())
            throw new IndexOutOfBoundsException();
        return data.get(i);
    }
}
