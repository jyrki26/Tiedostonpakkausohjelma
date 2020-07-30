package tiedostonpakkausohjelma.algorithms;

import java.util.HashMap;

/**
 * Huffmanin algoritmilla pakkaamisesta vastaava luokka.
 *
 */
public class Huffman {

    String text;
    HashMap<Character, Integer> values;
    byte[] bytes;

    public Huffman(String text) {
        this.text = text;
        this.values = new HashMap<>();
        bytes = text.getBytes();
    }

    /**
     * Metodi käy String-muotoon muutetun tiedoston läpi ja laskee hajautustaulun avulla eri merkkien lukumäärän.
     *
     */   
    public void StartHuffman() {
        BuildHashMap();
        for (Character key : values.keySet()) {
            System.out.println(key + " " + values.get(key));
        }
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }

    void BuildHashMap() {
        for (int i = 0; i < text.length(); i++) {
            if (!values.containsKey(text.charAt(i))) {
                values.put(text.charAt(i), 1);
            } else {
                values.put(text.charAt(i), values.get(text.charAt(i)) + 1);
            }
        }
    }
}
