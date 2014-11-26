/*
 * Ignacio Lorenzo
 * CSC 236-64
 * Lab 6-A
 */
package SwapTreesAllDay;

/**
 * 
 * @author ilorenzo
 */
public class BinaryTree implements Tree{
    
    BinaryTreeNode root;
    
    public static class BinaryTreeNode{
        int value;
        BinaryTreeNode leftChild, rightChild;
        
        //nested node class
        public BinaryTreeNode(){
            this.value = 0;
            leftChild = null;
            rightChild = null;
        }
        
        public BinaryTreeNode(int value){
        this.value = value;
        leftChild = null;
        rightChild = null;
        }
            public int getValue() {
        return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public BinaryTreeNode getLeft() {
            return leftChild;
        }

        public void setLeft(BinaryTreeNode newLeft) {
            leftChild = newLeft;
        }

        public BinaryTreeNode getRight() {
            return rightChild;
        }

        public void setRight(BinaryTreeNode newRight) {
            rightChild = newRight;
        }
        
    }
    
    public BinaryTree(){
        root = null;
    }
    //return treu if tree is empty
    public boolean isEmpty(){
        return root == null;
    }
    //insert value into the tree
    public void insert(int value){
        root = insert(root, value);
    }
 
    private BinaryTreeNode insert(BinaryTreeNode node, int value){
        if(node == null)
            node = new BinaryTreeNode(value);
        else{
            if(value <= node.value)
                node.leftChild = insert(node.leftChild,value);
            else
                node.rightChild = insert(node.rightChild,value);
        }
        return node;
    }
    
    public void printTree() {
        printTree(root);
        System.out.println();
    }
    //Inorder
    private void printTree(BinaryTreeNode node) {
        if (node == null) return;

        // left, node itself, right
        printTree(node.leftChild);
        System.out.print(node.value + "  ");
        printTree(node.rightChild);
    }
    //swap the left and right subtrees
    public void swapSubtrees() {
        swapSubtrees(root);
    }

    private void swapSubtrees(BinaryTreeNode node) {
        if (node != null) {
        // do the sub-trees
        swapSubtrees(node.leftChild);
        swapSubtrees(node.rightChild);

        // swap the left/right pointers
        BinaryTreeNode temp = node.leftChild;
        node.leftChild = node.rightChild;
        node.rightChild = temp;
        }
    } 
    //Count the ammount of single partents in the tree
    public int singleParent(){
        return singleParent(root);
    }
    
    public int singleParent(BinaryTreeNode node){
        if(node == null || countTheKids(node)==0)
            return 0;
        //If the countTheKids method returns 1 this means this is a single
        //parent
        if(countTheKids(node)==1){
            //Recustivly add 1 when a single parent is found
            return 1 + singleParent(node.getLeft()) 
                    + singleParent(node.getRight());
        }
        if(countTheKids(node)==2){
            //just pass on through nothing to see here! This parent has 2 kids
            return singleParent(node.getLeft()) + singleParent(node.getRight());
        }
        return 0;
    }
    //helper method for the singleParent method
    //This checks the ammount of kids a node has
    public int countTheKids(BinaryTreeNode node){
       int numberOfKids = 0;
       if(node.getLeft() != null)
           numberOfKids++;
       if(node.getRight() != null)
           numberOfKids++;
       return numberOfKids;
    }
    /**
    Prints out all of its root-to-leaf paths
    */
    public void printPaths() {
        int[] path = new int[1000];
        printPaths(root, path, 0);
    }

    /**
    Given a node,prints out all the root-leaf paths.
    */
    private void printPaths(BinaryTreeNode node, int[] path, int pathLen) {
        if (node==null) return;

            // append this node to the path array
            path[pathLen] = node.value;
            pathLen++;

        // it's a leaf, so print the path that led to here
        if (node.leftChild==null && node.rightChild==null) {
            printArray(path, pathLen);
        }
        else {
            // otherwise try both subtrees
            printPaths(node.leftChild, path, pathLen);
            printPaths(node.rightChild, path, pathLen);
        }
    }
    private void printArray(int[] ints, int len) {
        int i;
        for (i=0; i<len; i++) {
            System.out.print(ints[i] + " ");
        }
    System.out.println();
    } 
}

