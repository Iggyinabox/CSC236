/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab NumberHere
 */
package SwapTreesAllDay;

/**
 *
 * @author ilorenzo
 */
public class BinaryTreeTest {
    public static void main(String[] arg){
        System.out.println("----------- Tree 1 -----------");
        BinaryTree tree1 = new BinaryTree();
        
        tree1.insert(4);
        tree1.insert(2);
        tree1.insert(5);
        tree1.insert(1);
        tree1.insert(3);
        tree1.insert(6);
        
        //That hardcodding to get the one on top
        tree1.root.setValue(1);
        tree1.root.getLeft().setValue(2);
        tree1.root.getRight().setValue(3);
        tree1.root.getLeft().getLeft().setValue(4);
        tree1.root.getLeft().getRight().setValue(4);
        System.out.print("Inorder:");
        tree1.printTree();
        
        System.out.println("Number of Single Parents: " + tree1.singleParent());
        
        System.out.print("Paths:\n");
        tree1.printPaths();
        
        System.out.println("----------- Tree 2 -----------");
        BinaryTree tree2 = new BinaryTree();
        
        tree2.insert(14);
        tree2.insert(4);
        tree2.insert(15);
        tree2.insert(3);
        tree2.insert(9);
        tree2.insert(7);
        tree2.insert(5);
        tree2.insert(18);
        tree2.insert(16);
        tree2.insert(20);
        tree2.insert(17);
        System.out.print("Inorder:");
        tree2.printTree();
        System.out.print("Paths:\n");
        tree2.printPaths();
        System.out.println("Number of Single Parents: " + tree2.singleParent());
        
        
        System.out.println("------ Swaping sub trees ------");
        tree2.swapSubtrees();
        System.out.println("-------- Tree 2 Swaped --------");
        System.out.print("Inorder:");
        tree2.printTree();
        System.out.print("Paths:\n");
        tree2.printPaths();
        System.out.println("Number of Single Parents: " + tree2.singleParent());
    }
}
