/**
 * Created by PierreM on 24/11/2014.
 */
public interface IntSet {

    // Adds a new int to thw set; if it's there nothing happens
    void add(int value);

    // Returns true if the number is in the set, false otherwise
    boolean contains(int value);

    // Returns true if the number is in the set, false otherwise, but for every element that is checked prints its value on screen
    boolean containsVerbose(int value);

    // Returns a string with the values of the elements in the set separated by commas
    String toString();
}
