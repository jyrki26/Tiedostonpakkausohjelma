
package tiedostonpakkausohjelma.fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Tiedoston lukemisesta vastaava luokka.
 * 
 */
public class FileReader {
    
    private File file;
    
    public FileReader(File file) {
        this.file = file;
    }
    
    
 /**
 * Metodi lukee tiedoston, joka halutaan pakata.
 * 
 * @return Luettu tiedosto String-muodossa.
 *
 */
    public String Read(){
        String text ="";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                text = text + line;
            }
            scanner.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return text;
    }
}
