package obiektowe.linkedlists;

import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.AssertJUnit.*;


class MyLinkedListTest {

    public MyLinkedList<Integer> list = new MyLinkedList<>();
    @Test
    void add() {
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        list.add(11);
        assertEquals(Optional.ofNullable(list.get(1)), 11);
    }

    @Test
    void get() {
    }
}