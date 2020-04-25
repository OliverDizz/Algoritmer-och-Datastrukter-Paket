package Algoritmer_Vecka_14;
/*
UPPGIFT 1 ----------
 */

public class SimpleDataStructure {
    private String[] friends;
    private int counter;

    public SimpleDataStructure() {
        friends = new String[5];
        counter = 0;
    }

    /*Appends the other friend name to the end of this
    list.*/
    public boolean add(String other) {
        //if list is full, double it
        if (counter == friends.length){
            String[] temp = new String[friends.length * 2];
            for (int i = 0; i < friends.length; i++) {
                temp[i] = friends[i];
            }
            temp[counter] = other;
            counter++;
            friends = temp;
        }
        else {
            friends[counter] = other;
            counter++;

        }
        return true;
    }

    /**
     * returns the name at the specified index
     */
    public String get(int index) {
        if (index < friends.length){
            return friends[index];
        }
        throw new IllegalArgumentException("Get index out of bounds");
    }

    /**
     * removes the first occurrence of the specified element
     * in this list if the list contains the name
     */
    public boolean remove(String name) {
        int index = 0;

        //checks if elements equals
        for (int i = 0; i < counter; i++) {
            if (friends[i].equals(name)) {
                friends[i] = null;
                index = i;

                //moves elements to the left one step
                for (int j = index; j < friends.length - 1; j++) {
                    friends[j] = friends[j+1];
                }
                counter--;
                return true;
            }
        }
        return false;
    }

    /**
     * prints all names in the array friends
     */
    public void printFriends() {
        for (int i = 0; i < friends.length; i++) {
            if(friends[i] != null){
                System.out.print(friends[i] + " ");
            }
        }
        System.out.println();
    }

    public boolean addSort(String namn){
        int index = counter;
        //if the list is full, double it
        if (counter == friends.length){
            String[] temp = new String[friends.length * 2];
            for (int i = 0; i < friends.length; i++) {
                temp[i] = friends[i];
            }

            friends = temp;
        }

        //checks where to put namn to keep list sorted
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == null){
                continue;
            }
            if (namn.compareToIgnoreCase(friends[i]) < 0){
                index = i;
                break;
            }
        }

        //moves elements one step to the right to make place for namn
        for (int i = counter; i > index; i--) {
            friends[i] = friends[i - 1];
        }
        //inserts namn on free index
        friends[index] = namn;
        counter++;
        return true;
    }

    public static void main(String[] arg) {
        SimpleDataStructure myfriends = new SimpleDataStructure();
        myfriends.add("A");
        myfriends.add("C");
        myfriends.add("E");
        myfriends.add("G");

        myfriends.printFriends();
        System.out.println();
        myfriends.addSort("H");
        myfriends.addSort("F");
        myfriends.addSort("B");

        myfriends.printFriends();

    }

}
