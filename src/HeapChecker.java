public class HeapChecker {

    /**
     * addEltTester tests the addElt method in IHeap
     * @param hOrig heap
     * @param elt  element being added
     * @param hAdded tree element was added to
     * @return boolean
     *
     * Subtasks
     *
     * function
     *
     * isHeap
     * - goes in IHeap --> empty and non empty heap
     * - check to see if heap is valid after addElt
     *     - root is smaller than rest of tree
     *     - other branches are heaps
     *
     *  sameAsBefore
     *  - idk where to put this as it uses both the original heap and new tree ********!!
     * - original heap contains elements from new
     * - linked list??
     *
     *  wasEltAdded
     *  - i think IBinaryTree as it checks to see if the element is in the tree
     * - has element added
     * - utilizes counter
     *
     *  counter
     * - check to see if there are multiple elements in the same heap
     *
     *
     *
     */


    /**
     * addEltTester tests the addElt method and determines if new tree is a valid heap
     * @param hOrig original heap
     * @param elt element added to original heap
     * @param hAdded new heap containing new element
     * @return boolean
     */
    public boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
        if (hOrig.equals(new MtHeap()) & hAdded.equals(new MtHeap())) {
            return true;
        }
        return (hAdded.isHeap() && hAdded.containsAfterAdd(hOrig, elt, hAdded));

    }

     /* remMinEltTester tests the remMinElt method and determines if new tree is a valid heap
     * @param hOrig original heap
     * @param elt element removed from original heap
     * @param RemovedNum new heap without element
     * @return boolean
     */
    boolean remMinEltTester(IHeap Orig, IBinTree RemovedNum) {

        if(Orig.equals(new MtHeap()) & RemovedNum.equals(new MtHeap())){
            return true;
        }
        return (RemovedNum.isHeap() && RemovedNum.containsAfterRem(Orig));
    }



}
