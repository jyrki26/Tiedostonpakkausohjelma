package algorithmsTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tiedostonpakkausohjelma.algorithms.Huffman;


public class HuffmanTest {
    
    Huffman huffman;
    String text = "abbccc";
    
    public HuffmanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       huffman = new Huffman(text);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void HashMapHasRightAmountOfValues(){
        huffman.StartHuffman();
    }
}
