/**
 * Created by PierreM on 24/11/2014.
 */
public class TreeTest {
    public static void main(String[] args) {

        // Exercise 1.1
        IntegerTreeNode tree1 = new IntegerTreeNode(5);
        tree1.add(10);
        tree1.add(-5);
        tree1.add(5);
        tree1.add(35);
        tree1.add(17);
        tree1.add(9);

        System.out.println("Minimum value: "+tree1.getMin());
        System.out.println("Maximum value: "+tree1.getMax());

        // Exercise 1.2
        IntegerTreeNode tree2 = new IntegerTreeNode(6);
        tree2.add(5);
        tree2.add(9);
        tree2.add(3);
        tree2.add(8);
        tree2.add(11);
        tree2.add(12);

        System.out.println(tree2.toString());
        System.out.println(tree2.toStringLR());

        // Exercise 1.3
        System.out.println(tree2.depth());

        // Exercise 2.1 & 2.3
        IntSet tree3 = new TreeIntSet(6);
        tree3.add(5);
        tree3.add(9);
        tree3.add(3);
        tree3.add(8);
        tree3.add(11);
        tree3.add(11);
        tree3.add(12);
        System.out.println("It contains number 7: " + tree3.contains(7));
        System.out.println("It contains number 11: " + tree3.contains(11));
        System.out.println("It contains number 7: " + tree3.containsVerbose(7));
        System.out.println("It contains number 11: " + tree3.containsVerbose(11));
        System.out.println(tree3.toString());
    }
}