/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treedriver;

/**
 *
 * @author elijahblake12
 */
public class TreeDriver {

    public static void main(String[] args) {
        TreeManager tree = new TreeManager();       //creates an instance of a tree
        tree.addNode(12.25, "Starbucks", "Green");      //creates nodes that go into tree
        tree.addNode(12.25, "Starbucks", "Black");
        tree.addNode(2.30, "Dutch Bros", "Blue");
        tree.addNode(14.65, "Folgers", "Pink");
        tree.addNode(14.65, "Folgers", "Blue");
        tree.addNode(14.65, "Bolgers", "Blue");
        tree.addNode(14.65, "Folgers", "Blue");
        tree.addNode(1.40, "Pixie Turkeys", "Purple");
        tree.addNode(1.20, "Pixie Turkeys", "Burple");
        tree.addNode(1.20, "Pixie Turkeys", "Aurple");
        tree.addNode(3.50, "Nacho Chickens", "Yellow");
        tree.addNode(15.75, "Fat Pickles", "Brown");
        tree.addNode(13.70, "Agressive Squirrels", "White");
        
        tree.deleteNode(2, "Dutch Bros", "Blue"); //one example of deleting anode from the tree

        System.out.println("Tree in Order");        //all tree traversals
        tree.inOrderTraverseTree(tree.root);
        System.out.println("");
        System.out.println("Tree in Pre-Order");
        tree.preOrderTraverseTree(tree.root);
        System.out.println("");
        System.out.println("Tree in Post-Order");
        tree.postOrderTraverseTree(tree.root);

    }

}

class TreeManager {     //manages adding nodes, the traversals, and deleting nodes

    Node root;      //creates references to use build the tree
    Node leftChild;
    Node rightChild;
    Node currentPosition;       //keeps track of the current node we are on

    public void addNode(double price, String distributor, String color) {       //adds a node

        Node newNode = new Node(price, distributor, color);     //creates new node for purpose of comparing and finding place in tree

        if (root == null) {     //creates root
            root = newNode;
        } else {
            Node position = root;
            Node parent;

            while (true) {
                //case for left child
                parent = position;

                if (price == position.price && distributor == position.distributor && color == position.color) {        //does not add to the tree if all three elements of the coffee are the same
                    return;
                } else if (price == position.price && distributor != position.distributor) {        //compares distributor if price is the same
                    if (distributor.compareTo(position.distributor) < 0) {      //checks which distributor is higher priority
                        position = position.leftChild;

                        if (position == null) {
                            parent.leftChild = newNode;
                            return;
                        }
                    }
                } else if (price == position.price && distributor == position.distributor && color != position.color) {
                    if (color.compareTo(position.color) < 0) {
                        position = position.leftChild;

                        if (position == null) {
                            parent.leftChild = newNode;
                            return;
                        }
                    }
                } else if (price < position.price) {
                    position = position.leftChild;

                    if (position == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {//case for right child

                    if (price == position.price && distributor == position.distributor && color == position.color) {
                        return;
                    } else if (price == position.price && distributor != position.distributor) {
                        if (distributor.compareTo(position.distributor) < 0) {
                            position = position.rightChild;

                            if (position == null) {
                                parent.rightChild = newNode;
                                return;
                            }
                        }
                    } else if (price == position.price && distributor == position.distributor && color != position.color) {
                        if (color.compareTo(position.color) < 0) {
                            position = position.rightChild;

                            if (position == null) {
                                parent.rightChild = newNode;
                                return;
                            }
                        }
                    }
                    position = position.rightChild;

                    if (position == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }

    }

    public void inOrderTraverseTree(Node position) {
        if (position != null) {
            inOrderTraverseTree(position.leftChild);
            System.out.println(position);
            inOrderTraverseTree(position.rightChild);
        }
    }

    public void preOrderTraverseTree(Node position) {
        if (position != null) {
            System.out.println(position);
            preOrderTraverseTree(position.leftChild);
            preOrderTraverseTree(position.rightChild);
        }
    }

    public void postOrderTraverseTree(Node position) {
        if (position != null) {
            preOrderTraverseTree(position.leftChild);
            preOrderTraverseTree(position.rightChild);
            System.out.println(position);
        }
    }

    public boolean deleteNode(double price, String distributor, String color) {     //for deleting a node
        Node position = root;
        Node parent = root;
       
        boolean isleftChild = true;     //for finding if there is a leftchild
        
        while (position.price != price){
            parent = position;
            
        if (price < position.price){
            
            isleftChild = true;
            position = position.leftChild;
        }
        else{
        isleftChild = false;
        position = position.rightChild;
        }
        
        if(position == null){
            return false;
        }
    }
        
    if(position.leftChild == null && position.rightChild == null) {
        if(position == root){
            root = null;
        }
    
    
    else if(isleftChild){
        parent.leftChild = null;
    }
    else{
        parent.rightChild = null;
    }
    }
    else if(position.rightChild == null){
            if(position == root){
            root = position.leftChild;
            }
            else if(isleftChild){
            parent.leftChild = position.leftChild;
            }
            else {
            parent.rightChild = position.leftChild;
            }
            }
    else if(position.leftChild == null){
            if(position == root){
            root = position.rightChild;
            }
            else if(isleftChild){
            parent.leftChild = position.rightChild;
            }
            else{
            parent.rightChild = position.leftChild;
            }
            }
    
            else{
            Node replacement = getReplacementNode(position);
            
            if(position == root){
            root = replacement;
            }
            else if(isleftChild){
            parent.leftChild = replacement;
            }
            else{
            parent.rightChild = replacement;
            }
            replacement.leftChild = position.leftChild;
            }
    return true;
}
    public Node getReplacementNode(Node replacedNode){
       Node replacementParent = replacedNode;
       Node replacement = replacedNode;
       
       Node position = replacedNode.rightChild;
       
       while(position != null){
           replacementParent = replacement;
           replacement = position;
           position = position.leftChild;
       }
       
       if(replacement != replacedNode.rightChild){
           replacementParent.leftChild = replacement.rightChild;
           replacement.rightChild = replacedNode.rightChild;
       }
       return replacement;
    }
}
       
class Node {

    double price;
    String distributor;
    String color;

    Node rightChild;
    Node leftChild;

    Node(double price, String distributor, String color) {
        this.price = price;
        this.distributor = distributor;
        this.color = color;
    }

    public String toString() {
        return price + " " + distributor + " " + color;
    }

}
