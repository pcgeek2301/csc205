package Program_3;

public class LogicTests2 {
    public static void main(String[] args) {
        Tree<Integer> tree = new BSTree<Integer>();
        
        tree.add(50);
        tree.add(45);
        tree.add(52);
        tree.add(45); 
        tree.add(47);
        tree.add(30);
        tree.add(46);
        tree.add(48);
        tree.add(49);
        tree.toString();
        
    }
}