package obiektowe.linkedlists;

import java.util.*;
import java.util.LinkedList;


public class MyLinkedList<E> implements List<E> {

    private MyNode<E> first = null;
    private int actualSize = 0;

    @Override
    public int size() { return actualSize; }

    @Override
    public boolean add(E element) {

        actualSize++;
        if(first == null) {
            first = new MyNode<>(element, null);
            return true; //Nie potrzebujemy dalszej akcji, ponieważ ustawiliśmy nowy jako pierwszy
        }
        MyNode<E> actualNode = first;
        while(actualNode.next != null) { //Czy Node posiada następny element? Jeśli tak, aktualizuj zmienną
            actualNode = actualNode.next;
        }
        actualNode.next = new MyNode<>(element, null);
        return true;
    }

    @Override
    public E get(int index) {
        MyNode<E> actualNode = first;
        for (int i = 1; i <= index; i++) { //Czy Node posiada następny element? Jeśli tak, aktualizuj zmienną
            actualNode = actualNode.next;
        }
        return actualNode.value;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
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
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
        MyNode<E> actual = first;
        MyNode<E> beforeActual = null;
        for (int i = 1; i<=index; i++) {
            beforeActual = actual;
            actual = actual.next;
        }
        MyNode<E> newNode = new MyNode<>(element, actual);
        if(beforeActual != null) {
            beforeActual.next = newNode;
        } else {

        }
    }

    @Override
    public E remove(int index) {
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
}



