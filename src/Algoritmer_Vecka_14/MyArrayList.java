package Algoritmer_Vecka_14;

import java.util.*;

public class MyArrayList<AnyType> implements Iterable<AnyType> {

    private AnyType[] list;
    private int count;
    private int maxSize;

    public MyArrayList() {
        maxSize = 10;
        count = 0;
        list = (AnyType[]) new Object[maxSize];

    }

    /* Is not used because MyArrayList is dynamic, so no specified size is used
    public MyArrayList(int initialCapacity) {
        list = (AnyType[]) new Object[initialCapacity];
    }

     */

    /*Appends the specified element to the end of this list.*/
    /*
    public boolean add(AnyType o) {
        if (count == maxSize) {
            maxSize = maxSize * 2;
            AnyType[] temp = new Object[maxSize];
            for (int i = 0; i < count; i++) {
                temp[i] = list[i];
            }
            list = temp;
        }
        list[count] = o;
        return true;
    }
    */
    /**
     * tests if the specified element is a component of this list
     */
    public boolean contains(AnyType o) {
        for (int i = 0; i < count; i++) {
            if (list.equals(o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * returns the component at the specified index
     */
    public AnyType get(int index) {
        if (index > (maxSize - 1) || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        } else {
            return list[index];
        }
    }

    /**
     * Search for the first occurrence of the given argument testing for the equality using
     * equals method
     */
  /*  public int indexOf(AnyType o) {
        for (int i = 0; i < count; i++) {

        }
    }
    */
    
    /**
     * tests if this list has no components
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * removes the first occurrence of the specified element in this list
     * if the list contains the
     */
    public boolean remove(AnyType o) {
        return true;
    }

    /**
     * returns the number of components in this list
     */
    public int size() {
        return count;
    }

    /**
     * returns an array containing all elements in this list in the correct order
     */
    public Object[] toArray() {
        return null;
    }

    public Iterator<AnyType> iterator() {
        // return object ArrayListIterator
        return null;
    }

}