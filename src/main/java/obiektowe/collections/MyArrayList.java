package obiektowe.collections;

public class MyContainer<E> {
    private E object;




    public E setData(E data) {
        this.object = data;
        return this.object;
    }

    public E getData() {
        return this.object;
    }


}
