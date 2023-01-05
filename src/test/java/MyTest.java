import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//
//class SampleTest {
//
//
//    private ArrayList<Integer> myList;
//    private static int iter;
//
//    @BeforeAll
//    static void setUp() {
//        iter = 0;
//    }
//
//    @BeforeEach
//    void init() {
//
//        myList = new ArrayList<>();
//        myList.add(11);
//        myList.add(12);
//        myList.add(13);
//        myList.add(14);
//
//    }
//
//    @Test
//    void listLengthTest() {
//        assertEquals(4, myList.size(), "wrong size");
//    }
//
//    @Test
//    void getValTest() {
//        assertEquals(13, myList.get(2), "wrong value");
//    }
//
//    @Test
//    void arrayEqualsTest() {
//        Integer arr2[] = {11,12,13,144};
//
//        Integer arr[]  = new Integer[myList.size()];
//        arr = myList.toArray(arr);
//
//        assertArrayEquals(arr2, arr, "oops...wrong values in array");
//
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {11,12,13,14})
//    void paramTest(int val) {
//
//        assertEquals(myList.get(iter), val, "nope...wrong val");
//        iter++;
//    }
//
//}

class MyTest {


    Card a = new Card('H',2);
    Card b = new Card('H',3);
    Card c = new Card('H',4);
    Card d = new Card('H',5);
    private ArrayList<Card> myList;
    @BeforeEach
    void init() {
        myList = new ArrayList<>();
        myList.add(a);



    }

    @Test
    void getSize() {
        assertEquals(1, myList.size(), "correct");
    }

//    @Test
//    void getValTest() {
//        assertEquals(2, myCard.getValue(), "wrong value");
//    }


}
