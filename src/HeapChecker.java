public class HeapChecker {


    /**
     * addEltTester tests the addElt method and determines if new tree is a valid heap
     * @param hOrig original heap
     * @param elt element added to original heap
     * @param hAdded new heap containing new element
     * @return boolean
     * Subtasks
     *      * create helper function that determines whether the new tree is a valid heap
     *      * create a function that changes a tree into a list and compares elements of the list
     *      * determine if the element is correctly added to the new heap
     */
    public boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
        return (hAdded.isHeap() && hAdded.containsAfterAdd(hOrig, elt));
    }



    /** remMinEltTester tests the remMinElt method and determines if new tree is a valid heap
     * @param hOrig original heap
     * @param RemovedNum new heap without element
     * @return boolean
     * Subtasks
     *      * have a helper function that determines if the new tree is a valid heap or not
     *      * method that changes heaps into lists and compares if elements are the same
     *      * method that checks to see if the element was removed from the new heap
     */
    boolean remMinEltTester(IHeap hOrig, IBinTree RemovedNum) {

        if(hOrig.equals(new MtHeap()) & RemovedNum.equals(new MtHeap())){
            return true;
        }
        return (RemovedNum.isHeap() && RemovedNum.containsAfterRem(hOrig));
    }



}