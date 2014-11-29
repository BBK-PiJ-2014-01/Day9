/**
 * Created by PierreM on 24/11/2014.
 */
public class TreeIntSet implements IntSet {

    private int value;
    private TreeIntSet right;
    private TreeIntSet left;

    public TreeIntSet(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public void add(int newNumber) {
        if (newNumber != this.value) {
            if (newNumber > this.value) {
                if (right == null) {
                    right = new TreeIntSet(newNumber);
                } else {
                    right.add(newNumber);
                }
            } else {
                if (left == null) {
                    left = new TreeIntSet(newNumber);
                } else {
                    left.add(newNumber);
                }
            }
        }
    }

    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        } else if (n> this.value){
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }

    public boolean containsVerbose(int n) {
        System.out.println("Value "+this.value+" checked");
        if (n == this.value) {
            return true;
        } else if (n> this.value){
            if (right == null) {
                return false;
            } else {
                return right.containsVerbose(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.containsVerbose(n);
            }
        }
    }

    public String toString() {
        String s = "";
        s += value;
        if (left != null) {
            s = s + "," + left.toString();
        }
        if (right != null) {
            s = s + "," + right.toString();
        }
        return(s);
    }

}