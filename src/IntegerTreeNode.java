/**
 * Created by PierreM on 24/11/2014.
 */
public class IntegerTreeNode {
    private int value;
    private IntegerTreeNode left;
    private IntegerTreeNode right;

    public IntegerTreeNode (int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public void add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public int getMax() {
        if (right == null)
            return(value);
        else
            return(right.getMax());
    }

    public int getMin() {
        if (left == null)
            return(value);
        else
            return(left.getMin());
    }

    public String toString() {
        String s = "[";
        s += value;
        if (left != null) {
            s = s + " " + left.toString();
        }
        if (right != null) {
            s = s + " " + right.toString();
        }
        return(s+"]");
    }

    public String toStringLR() {
        String s = "[";
        s += value;
        if (left != null) {
            s = s + " L" + left.toStringLR();
        } else {
            s = s + " L[]";
        }

        if (right != null) {
            s = s + " R" + right.toStringLR();
        } else {
            s = s + " R[]";
        }
        return(s+"]");
    }

    public int depth() {
        int count = 1;
        int maxCountLeft = 0;
        int maxCountRight = 0;
        if (left != null) {
            count += left.depth();
            if (count > maxCountLeft)
                maxCountLeft = count;
        }
        if (right != null) {
            count += right.depth();
            if (count > maxCountRight)
                maxCountRight = count;
        }
        if (maxCountLeft > maxCountRight)
            return(maxCountLeft);
        else
            return(maxCountRight);
    }
}
