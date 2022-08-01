package obiektowe.collections;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private E[] elements = (E[]) new Object[10];


//    private void grow() {
//        E[] newArray = (E[]) new Object[elements.length * 2];
//        for(int i = 0; i < elements.length; i++) {
//            newArray[i] = elements[i];
//        }
//    }


    private void grow() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
    private int actualSize;
    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= actualSize) {
            throw new IndexOutOfBoundsException("");
        }
        return elements[index];
    }

    @Override
    public E set(int index, E element) {
        if(element == null) throw new NullPointerException();
        elements[index] = element;
        return element;
    }

    @Override
    public boolean add(E e) {
        if (e == null) return false;
        elements[actualSize++] = e;
        if(actualSize == elements.length) { //Jeśli brakuje miejsca, powiększ zbiór
            grow();
        }

        return true;
    }
    @Override
    public void add(int index, E element) {
        for(int i = actualSize-1; i >= index; i--) {
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        actualSize++;
        if(actualSize == elements.length) { //Jeśli brakuje miejsca, powiększ zbiór
            grow();
        }
    }


    @Override
    public boolean isEmpty() {
        return actualSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (E e:elements){
            if (e==o){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }




    @Override
    public E remove(int index) {
        elements[index] = null;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }




}
