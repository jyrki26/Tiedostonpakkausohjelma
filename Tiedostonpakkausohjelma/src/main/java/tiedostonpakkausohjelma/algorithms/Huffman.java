package tiedostonpakkausohjelma.algorithms;

import java.util.HashMap;
import java.util.PriorityQueue;
import tiedostonpakkausohjelma.algorithms.Node.ImplementComparator;

/**
 * Huffmanin algoritmilla pakkaamisesta vastaava luokka.
 *
 */
public class Huffman {

    String text;
    HashMap<Character, Integer> values;
    byte[] bytes;
    PriorityQueue<Node> nodes;
    Node first;

    public Huffman(String text) {
        this.text = text;
        this.values = new HashMap<>();
        bytes = text.getBytes();
        nodes = new PriorityQueue<>(new ImplementComparator());
    }

    /**
     * Metodi käy String-muotoon muutetun tiedoston läpi ja laskee
     * hajautustaulun avulla eri merkkien lukumäärän.
     *
     */
    public void StartHuffman() {
        BuildHashMap();
        for (Character key : values.keySet()) {
            nodes.add(new Node(values.get(key), key));
        }
        CreateTree();
        CreateCode(first, "");

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

    void CreateTree() {

        while (nodes.size() > 1) {
            Node a = nodes.poll();
            Node b = nodes.poll();
            
            int x = a.getNumber() + b.getNumber();
            
            Node n = new Node(x, '-');
            n.setLeft(a);
            n.setRight(b);

            first = n;
            nodes.add(n);
        }
        
    }

    public void CreateCode(Node node, String s) {
        if (node.getLeft() == null && node.getRight() == null && Character.isLetter(node.getCharacter())) {
            System.out.println(node.getRight() + "   |  " + s);

            return;
        }

        CreateCode(node.getLeft(), s + "0");
        CreateCode(node.getRight(), s + "1");

    }

}
