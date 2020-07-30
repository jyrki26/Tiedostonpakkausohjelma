package fileReaderTest;


import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import tiedostonpakkausohjelma.fileHandler.FileReader;


public class FileReaderTest {
    
    FileReader fileReader;
    
    public FileReaderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fileReader = new FileReader(new File("test.txt"));
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void FileIsReadCorrectly(){
        String text = fileReader.Read();
        assertEquals("abbccc", text);
    }

   
}
