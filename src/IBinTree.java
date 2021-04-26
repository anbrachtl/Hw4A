import java.lang.Math;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;


interface IBinTree {
    // determines whether element is in the tree
    boolean hasElt(int e);

    // returns number of nodes in the tree; counts duplicate elements as separate items
    int size();

    // returns depth of longest branch in the tree
    int height();

    //----------------added below----------------------------------------------------

    public boolean isHeap();

    public boolean containsAfterAdd(IHeap hOrig, int elt, IBinTree hAdded);

    public boolean containsAfterRem(IHeap heap);

    public boolean compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2);

    public boolean equals(IBinTree heap);

    public LinkedList<Integer> treeToList(IBinTree hAdded);

    IBinTree getLeftChild();

    IBinTree getRightChild();

    int getData();


//----------------------added above-------------------------------------------

}

class MtBT implements IBinTree {
    MtBT() {
    }

    // returns false since empty tree has no elements
    public boolean hasElt(int e) {
        return false;
    }

    // returns 0 since enpty tree has no elements
    public int size() {
        return 0;
    }

    // returns 0 since empty tree has no branches
    public int height() {
        return 0;
    }

    //-------------------added-code-------------------------------------------------


    /**
     * getLeftChild: consumes a IBinTree return the left child tree.
     * returns null since empty tree does not have a left child.
     *
     * @return null
     */
    public IBinTree getLeftChild() {
        return null;
    }


    /**
     * getRightChild: consumes a IBinTree return the right child tree
     * returns null since empty tree does not have a right child.
     *
     * @return null
     */
    public IBinTree getRightChild() {
        return null;
    }


    /**
     * getData: consumes a IBinTree and return data for IBinTree interface.
     * returns 0 since getData will not be used on an empty node and an empty node does not have a key.
     *
     * @return 0
     */
    public int getData() {
        return 0;
    }

    /**
     * isHeap: consumes a MtBT and return true because an empty tree is a heap.
     *
     * @return true
     */
    public boolean isHeap() {
        return true;
    }


    /**
     * treeToList takes an empty tree and returns an empty list
     *
     * @param hAdded
     * @return empty list
     */
    public LinkedList<Integer> treeToList(IBinTree hAdded) {
        return new LinkedList<Integer>();
    }


    /**
     * compareLists: consumes two lists and return true if both lists are the same.
     *
     * @param list1 First list
     * @param list2 Second list
     * @return boolean
     */
    public boolean compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }


    /**
     * equals: consumes a DataBT and a heap then returns true if both heaps and a MtBT contain no children.
     *
     * @param heap consumes a DataBT
     * @return boolean
     */
    public boolean equals(IBinTree heap) {
        return heap.getLeftChild() == null && heap.getRightChild() == null;
    }


    /**
     * containsAfterAdd determines if element is added. Empty tree so returns false
     *
     * @param heap   original heap
     * @param elt    element added to heap
     * @param hAdded new heap with element
     * @return false
     */
    public boolean containsAfterAdd(IHeap heap, int elt, IBinTree hAdded) {
        return false;
    }


    /**
     * containsAfterRem: consumes a DataBT and a heap, returns true if both binary trees contain the same data nodes
     *
     * @param heap
     * @return boolean
     */
    public boolean containsAfterRem(IHeap heap) {
        ArrayList<Integer> heapElements = new ArrayList<>();
        ArrayList<Integer> binaryElements = new ArrayList<>();

        Tree heapData = new Tree();
        Tree binaryData = new Tree();

        heapData.storeKeyValues(heap);
        binaryData.storeKeyValues(this);

        heapElements = heapData.values;
        heapElements.remove(Collections.min(heapElements));
        binaryElements = binaryData.values;

        return compareLists(heapElements, binaryElements);
    }


}

//----------added-ends-^^^^-----------------------------------------------------------^^

class DataBT implements IBinTree {
    int data;
    IBinTree left;
    IBinTree right;

    DataBT(int data, IBinTree left, IBinTree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // an alternate constructor for when both subtrees are empty
    DataBT(int data) {
        this.data = data;
        this.left = new MtBT();
        this.right = new MtBT();
    }

    // determines whether this node or node in subtree has given element
    public boolean hasElt(int e) {
        return this.data == e || this.left.hasElt(e) || this.right.hasElt(e);
    }

    // adds 1 to the number of nodes in the left and right subtrees
    public int size() {
        return 1 + this.left.size() + this.right.size();
    }

    // adds 1 to the height of the taller subtree
    public int height() {
        return 1 + Math.max(this.left.height(), this.right.height());
    }


// -------------------------------------added code below------------

    /**
     * getLeftChild: consumes a IBinTree return the left child tree.
     *
     * @return this.left
     */
    public IBinTree getRightChild() {
        return this.left;
    }


    //getRightChild: consumes a IBinTree return the right child tree.

    /**
     * getRightChild: consumes a IBinTree return the right child tree.
     *
     * @return this.right
     */
    public IBinTree getLeftChild() {
        return this.right;
    }


    /**
     * getData: consumes a IBinTree and return data for IBinTree interface
     *
     * @return this.data
     */
    public int getData() {
        return this.data;
    }

    /**
     * isHeap: consumes a DataBT and return true if the tree is a heap with following conditions:
     * if the node has no children then the tree is a heap,
     * if the node has no right child and the left child's data is greater than the node's then the tree is a heap,
     * if the node has no left child and the right child's data is greater than the node's then the tree is a heap,
     * if the node's children's data are greater than the node's then the tree is a heap.
     *
     * @return boolean
     */
    public boolean isHeap() {

        //Both are empty nodes
        if (this.left.equals(new MtBT()) && this.right.equals(new MtBT())) {

            return true;
        }
        //Right node is empty, check left.
        else if (this.right.equals(new MtBT())
                && this.left.getData() >= this.data
                && this.left.isHeap()) {

            return true;
        }
        //Left node is empty, check right.
        else if (this.left.equals(new MtBT())
                && this.right.getData() >= this.data
                && this.right.isHeap()) {

            return true;
        }
        //Check both nodes.
        else if (this.right.getData() >= this.data
                && this.left.getData() >= this.data
                && this.right.isHeap()
                && this.left.isHeap()) {

            return true;
        }
        //The tree is not a heap.
        return false;
    }


//containsAfterAdd: consumes a DataBT, a heap, and an integer,
//                  then returns true if both binary trees contain the same data nodes.
//                  needs to needs implemented;

    public boolean containsAfterAdd(IHeap hOrig, int elt, IBinTree hAdded) {
        LinkedList<Integer> originalList = new LinkedList<Integer>();
        LinkedList<Integer> newList = new LinkedList<Integer>();

        originalList = treeToList(hOrig);
        newList = treeToList(hAdded);

        if (newList.contains(elt)) {
            newList.remove(elt);   //clean element from list
        } else return false;

        for (int e : originalList) {

            int origCount = 0;
            int newCount = 0;

            if (newList.size() == originalList.size()) {

                for (int o : originalList) {
                    if (o == e) {
                        origCount++;
                    }
                }
                for (int n : newList) {
                    if (n == e) {
                        newCount++;
                    }
                }
            } else return false;

            if (origCount != newCount) {
                return false;
            }

        }
        return true; //return //TODO

    }


    /**
     * treeToList takes a tree and puts it into a linked list
     *
     * @param hAdded binary tree
     * @return linked list of integers that represents the tree values
     */
    public LinkedList<Integer> treeToList(IBinTree hAdded) {
        LinkedList<Integer> list = new LinkedList();
        list.add(this.data);
        for (int i = 0; i < this.left.size(); i++) {
            list.add(left.treeToList(hAdded).get(i));
        }
        for (int i = 0; i < this.right.size(); i++) {
            list.add(this.right.treeToList(hAdded).get(i));
        }
        return list;
    }


    /**
     * containsAfterRem:
     *
     * @param heap consumes a DataBT and a heap
     * @return boolean returns true if both binary trees contain the same data nodes
     */
    public boolean containsAfterRem(IHeap heap) {
        ArrayList<Integer> heapElements = new ArrayList<>();
        ArrayList<Integer> binaryElements = new ArrayList<>();

        Tree heapData = new Tree();
        Tree binaryData = new Tree();

        heapData.storeKeyValues(heap);
        binaryData.storeKeyValues(this);

        heapElements = heapData.values;
        if (!heapElements.equals(new ArrayList<Integer>())) {
            heapElements.remove(Collections.min(heapElements));
        }
        binaryElements = binaryData.values;

        return compareLists(heapElements, binaryElements);
    }


    /**
     * compareLists: consumes two lists and return true if both lists are the same.
     *
     * @param list1 First List
     * @param list2 First List
     * @return boolean true if both lists are the same.
     */
    public boolean compareLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }


    //equals: consumes a DataBT and a heap then returns true if both are equal,
    //        however, there is no need to compare a heap to a non-empty node, thus returns false.

    /**
     * equals: consumes a DataBT and a heap then returns true if both are equal,
     * however, there is no need to compare a heap to a non-empty node, thus returns false.
     *
     * @param heap consumes a DataBT and a heap
     * @return boolean returns true if both are equal, however,
     * there is no need to compare a heap to a non-empty node, thus returns false.
     */
    public boolean equals(IBinTree heap) {
        return false;
    }


}

class Tree {
    ArrayList<Integer> values = new ArrayList<Integer>();


    /**
     * storeKeyValues: consumes a binary tree and return an array list containing the key values
     *
     * @param root consumes a binary tree
     * @return Arraylist containing key values
     */
    public ArrayList<Integer> storeKeyValues(IBinTree root) {
        treeValues(root);
        return values;
    }


    /**
     * treeTravel: consumes a binary tree and add the key values into a list.
     *
     * @param node binary tree
     */
    private void treeValues(IBinTree node) {
        if (!node.equals(new MtHeap())) {
            treeValues(node.getLeftChild());
            values.add(node.getData());
            treeValues(node.getRightChild());
        }
    }
}
