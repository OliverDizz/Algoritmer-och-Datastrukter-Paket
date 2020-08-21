package Algoritmer_Vecka_14;

import org.w3c.dom.ls.LSOutput;

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



    public MyArrayList(int initialCapacity) {
        list = (AnyType[]) new Object[initialCapacity];
    }



    /**
     * Appends the specified element to the end of this list.
     */

    public boolean add(AnyType o) {
        if (o == null){
            System.out.println("Exception: Element far ej vara null");
            return false;
        }
        if (count == maxSize) {                            //doubles list when true
            maxSize = maxSize * 2;
            AnyType[] temp = (AnyType[]) new Object[maxSize];
            for (int i = 0; i < count; i++) {
                temp[i] = list[i];
            }
            list = temp;
            list[count] = o;
            count++;
            return true;
        }
        list[count] = o;
        count++;
        return true;
    }

    /**
     * tests if the specified element is a component of this list
     */
    public boolean contains(AnyType o) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(o)) {
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
    public int indexOf(AnyType o) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    
    /**
     * tests if this list has no components
     */
    public boolean isEmpty() {
        if (count == 0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * removes the first occurrence of the specified element in this list
     * if the list contains the
     */
    public boolean remove(AnyType o) {
        for (int i = 0; i < count; i++) {
            if (list[i].equals(o)){
                list[i] = null;
                for (int j = i; j < count-1; j++) {
                    list[j] = list[j+1];
                }
                count--;
                return true;
            }   
        }
        return false;
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
        if (count == 0){
            AnyType[] temp  = list.clone();
            temp = null;
            return temp;
        }
        else{
            return list;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            String item = (String) list[i];
            System.out.println(item);
        }
    }

    public Iterator<AnyType> iterator() {
        // return object ArrayListIterator
        Iterator<AnyType> item = new ArrayListIterator<AnyType>(list, count);
        return item;
    }

}