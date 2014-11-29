/**
 * Created by PierreM on 24/11/2014.
 */
public interface IntSortedList {

    // Adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set
    void add(int value);

    // Returns true if teh number is in the set, false otherwise
    boolean contains(int value);

    // Returns a string with the values of the elements in the list separated by commas
    String toString();

}
