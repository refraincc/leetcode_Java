package List;

public interface List<E> {
    
    static final int ELEMENT_NOT_FOUND = -1;

    void clear();

    int size();

    boolean isEmpty();

    boolean contains(E element);

    void add(E emelent);

    void add(int index, E element);

    int indexOf(E element);

    E remove(int index);

    E get(int index);

    E set(int index, E element);

    


}
