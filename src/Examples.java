import org.junit.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Robert Batista and Abigail Brachtl
 */

public class Examples {

    public Examples(){
        myHeap = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));
        myBinTree = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));

        HeapRemoved = new DataHeap(4,
                new DataHeap(8,
                        new MtHeap(),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));

        HeapDuplicate = new DataHeap(2,
                new DataHeap(2,
                        new DataHeap(4,
                                new MtHeap(),
                                new DataHeap(8)),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HeapDuplicate = new DataHeap(2,
                new DataHeap(2,
                        new DataHeap(4,
                                new MtHeap(),
                                new DataHeap(8)),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HeapValue = new DataHeap(27);


        HeapNegative = new DataHeap(-27,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HeapEmpty = new MtHeap();


        HeapAdded = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(19),
                                new MtHeap())));


        HeapAdded2 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(7,
                                new DataHeap(12),
                                new MtHeap()),
                        new DataHeap(14)));


        HeapAdded3 = new DataHeap(1,
                new DataHeap(2,
                        new DataHeap(4,
                                new DataHeap(8),
                                new DataHeap(10)),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HeapAdded4 = new DataHeap(-10,
                new DataHeap(2,
                        new DataHeap(4,
                                new DataHeap(8),
                                new DataHeap(10)),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HeapAdded5 = new DataHeap(2,
                new DataHeap(2,
                        new DataHeap(4,
                                new DataHeap(8),
                                new DataHeap(10)),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HeapAdded6 = new DataHeap(27);


        HeapInvalidHeap1 = new DataHeap(27,
                new DataHeap(4,
                        new DataHeap(2),
                        new DataHeap(10)),
                new DataHeap(14,
                        new DataHeap(16),
                        new DataHeap(12,
                                new DataHeap(8),
                                new MtHeap())));

        HeapInvalidHeapA2 = new DataHeap(27,
                new DataHeap(4,
                        new DataHeap(2),
                        new DataHeap(10)),
                new DataHeap(14,
                        new DataHeap(6),
                        new DataHeap(12,
                                new DataHeap(8),
                                new MtHeap())));


        HeapAddTooMany = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(27),
                                new DataHeap(27,
                                        new DataHeap(27),
                                        new DataHeap(27)))));

        HeapAddTooMany1 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(27),
                                new DataHeap(27,
                                        new DataHeap(27),
                                        new DataHeap(27)))));


        HeapEltTooMany1 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(14),
                                new DataHeap(14,
                                        new DataHeap(27),
                                        new MtHeap()))));


        HeapWrongTotal1 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(27)));


        HeapRemoved2 = new DataHeap(2,
                new DataHeap(4,
                        new DataHeap(8),
                        new DataHeap(10)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HeapRemoved3 = new DataHeap(4,
                new DataHeap(8,
                        new DataHeap(10),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14)));


        HeapThrowFalse = new DataHeap(9,
                new DataHeap(99,
                        new DataHeap(999,
                                new DataHeap(9999,
                                        new DataHeap(9999),
                                        new MtHeap()),
                                new MtHeap()),
                        new MtHeap()),
                new MtHeap());


        HeapInvalidHeap2 = new DataHeap(4,
                new DataHeap(10,
                        new DataHeap(8),
                        new MtHeap()),
                new DataHeap(12,
                        new DataHeap(6,
                                new DataHeap(14),
                                new MtHeap()),
                        new MtHeap()));


        HeapRemoveTooMany = new DataHeap(8,
                new DataHeap(10,
                        new DataHeap(12),
                        new DataHeap(14)),
                new DataHeap(6,
                        new DataHeap(12),
                        new MtHeap()));


        HeapEltTooMany2 = new DataHeap(4,
                new DataHeap(8,
                        new DataHeap(10),
                        new DataHeap(14)),
                new DataHeap(6,
                        new DataHeap(12),
                        new DataHeap(14,
                                new DataHeap(14),
                                new MtHeap())));


        HeapWrongTotal2 = new DataHeap(4,
                new DataHeap(8,
                        new DataHeap(10),
                        new MtHeap()),
                new DataHeap(6,
                        new DataHeap(12),
                        new MtHeap()));




        testCompareList1.add(1);
        testCompareList1.add(2);
        testCompareList1.add(3);


        testCompareList2.add(2);
        testCompareList2.add(3);
        testCompareList2.add(1);


        testCompareList3.add(1);
        testCompareList3.add(2);
        testCompareList3.add(5);


        testCompareList4.add(1);
        testCompareList4.add(2);
    }

    HeapChecker HT = new HeapChecker();
    IBinTree BT;
    IHeap myHeap;
    IHeap HeapRemoved;
    IHeap HeapDuplicate;
    IHeap HeapValue;
    IHeap HeapNegative;
    IHeap HeapEmpty;
    IHeap NonEmptyHeap;
    IHeap HeapAddTooMany1;
    IBinTree myBinTree;
    IBinTree HeapAdded;
    IBinTree HeapAdded2;
    IBinTree HeapAdded3;
    IBinTree HeapAdded4;
    IBinTree HeapAdded5;
    IBinTree HeapAdded6;
    IBinTree HeapInvalidHeap1;
    IBinTree HeapInvalidHeapA2;
    IBinTree HeapAddTooMany;
    IBinTree HeapEltTooMany1;
    IBinTree HeapWrongTotal1;
    IBinTree HeapRemoved2;
    IBinTree HeapRemoved3;
    IBinTree HeapThrowFalse;
    IBinTree HeapInvalidHeap2;
    IBinTree HeapRemoveTooMany;
    IBinTree HeapEltTooMany2;
    IBinTree HeapWrongTotal2;
    DataBT testDataBT = new DataBT(1);
    DataBT testData2BT = new DataBT(2);
    MtHeap MT = new MtHeap();


    ArrayList<Integer> testCompareList1 = new ArrayList<>();
    ArrayList<Integer> testCompareList2 = new ArrayList<>();
    ArrayList<Integer> testCompareList3 = new ArrayList<>();
    ArrayList<Integer> testCompareList4 = new ArrayList<>();


    // isHeap tests below----------------------------------------
    @Test
    public void testIsHeapMethodValidTrue() {
        assertTrue(myBinTree.isHeap());
    }

    @Test
    public void testIsHeapMethodInValidFalse() {
        assertFalse(HeapInvalidHeap2.isHeap());
    }

    @Test
    public void testIsHeapInValidFalse() {
        assertFalse(HeapInvalidHeap1.isHeap());
    }

    @Test
    public void testIsHeapEmptyTrue () {
        assertTrue(HeapEmpty.isHeap());
    }

    @Test
    public void testIsHeapMultiElt() {
        assertTrue(HeapAddTooMany1.isHeap());
    }

    @Test
    public void testIsHeapMultiEltBin() {
        assertTrue(HeapAddTooMany.isHeap());
    }

    //--------------compareList tests below-------------------------------

    @Test
    public void testCompareListsTrue(){
        assertTrue(testDataBT.compareLists(testCompareList1, testCompareList2));
    }

    @Test
    public void testCompareListsNotSameElements(){
        assertFalse(testDataBT.compareLists(testCompareList1, testCompareList3));
    }

    @Test
    public void testCompareListsNotSameSize(){
        assertFalse(testDataBT.compareLists(testCompareList1, testCompareList4));
    }
    // ----------------equals test below-------------------------------------

    @Test
    public void testEqualsTrue(){
        MtHeap testMtHeap = new MtHeap();
        assertTrue(testMtHeap.equals(new MtHeap()));
    }

    // ----------remMinEltTester tests below------------------------------
    @Test
    public void testRemMinEltTesterNormalRemoval(){
        assertTrue(HT.remMinEltTester(myHeap, HeapRemoved));
    }

    @Test
    public void testRemMinEltTesterRemoveDuplicate(){
        assertTrue(HT.remMinEltTester(HeapDuplicate, HeapRemoved2));
    }

    @Test
    public void testRemMinEltTesterRemoveNegative(){
        assertTrue(HT.remMinEltTester(HeapNegative, HeapRemoved3));
    }

    @Test
    public void testRemMinEltTesterRemoveOneValue(){
        assertTrue(HT.remMinEltTester(HeapValue, HeapEmpty));
    }

    @Test
    public void testRemMinEltTesterRemoveEmpty(){
        assertTrue(HT.remMinEltTester(HeapEmpty, HeapEmpty));
    }

    @Test
    public void testRemMinEltTesterRemoveEmpty2(){
        assertFalse(HT.remMinEltTester(HeapEmpty, HeapThrowFalse));
    }

    @Test
    public void testRemMinEltTesterThrowFalse(){
        assertFalse(HT.remMinEltTester(myHeap, HeapThrowFalse));
    }

    @Test
    public void testRemMinEltTesterInvalidHeap(){
        assertFalse(HT.remMinEltTester(myHeap, HeapInvalidHeap2));
    }

    @Test
    public void testRemMinEltTesterAddedTooMany(){
        assertFalse(HT.remMinEltTester(myHeap, HeapRemoveTooMany));
    }

    @Test
    public void testRemMinEltTesterEltTooMany(){
        assertFalse(HT.remMinEltTester(myHeap, HeapEltTooMany2));
    }

    @Test
    public void testRemMinEltTesterWrongTotal() {
        assertFalse(HT.remMinEltTester(myHeap, HeapWrongTotal2));
    }

    @Test
    public void testRemMinEltTesterWithRemElt() {
        assertTrue(HT.remMinEltTester(myHeap,myHeap.remMinElt()));
    }

//-------------------------------addEltTester tests below------------------------

    /**
     * myHeap = new DataHeap(2,
     *                 new DataHeap(4,
     *                         new DataHeap(8),
     *                         new DataHeap(10)),
     *                 new DataHeap(6,
     *                         new DataHeap(12),
     *                         new DataHeap(14)));
     */

    @Test
        public void testAddTesterAdd1BottomTree(){
            assertTrue(HT.addEltTester(myHeap, 19, HeapAdded));
        }

        @Test
        public void testAddTesterAdd2MiddleTree() {
            assertTrue(HT.addEltTester(myHeap, 7, HeapAdded2));
    }

        @Test
        public void testAddEltTesterAdd3TopTree(){
            assertTrue(HT.addEltTester(myHeap, 1, HeapAdded3));
        }
        @Test
        public void testAddEltTesterAdd4NegativeNumber(){
            assertTrue(HT.addEltTester(myHeap, -10, HeapAdded4));
        }

        @Test
         public void testAddEltTesterAddMultiEltNumber(){
             assertTrue(HT.addEltTester(myHeap, 2, HeapAdded5));
        }
         @Test
         public void testAddEltTesterAddNegativeNumber1(){
              assertTrue(HT.addEltTester(HeapEmpty, 27, HeapAdded6));
        }
        @Test
        public void testAddEltTesterInvalidHeap() {
            assertFalse(HT.addEltTester(myHeap,27, HeapInvalidHeapA2));
        }
        @Test
        public void testAddEltTesterTooManyBottomTree() {
            assertFalse(HT.addEltTester(myHeap, 27, HeapAddTooMany));
        }
        @Test
        public void testAddEltTesterTooManyMiddleTree() {
            assertFalse(HT.addEltTester(myHeap, 14, HeapEltTooMany1));
        }
        @Test
        public void testAddEltTesterWrongTotalInNewTree() {
            assertFalse(HT.addEltTester(myHeap, 27, HeapWrongTotal1));
        }
        @Test
        public void testAddEltTesterSimplyWrong() {
            assertFalse(HT.addEltTester(myHeap, 9, HeapThrowFalse));
        }



}