package tiedostonpakkausohjelma.ui;

import java.io.File;
import java.util.Scanner;

import tiedostonpakkausohjelma.fileHandler.FileReader;
import tiedostonpakkausohjelma.algorithms.Huffman;

public class AppUi {

    Scanner scanner;
    File file;
    FileReader filereader;
    int number;

    public AppUi() {
        scanner = new Scanner(System.in);
    }

    /**
     * Metodi käynnistää ohjelman.
     *
     */
    public void Start() {
        System.out.println("Käynnissä");
        while (true) {
            Dialog();
            if(number == 3){
                System.out.println("Ohjelma sammutettu.");
                break;
            }
        }
    }

    /**
     * Metodi käynnistää käyttöliittymän dialogin, jossa valitaan mitä halutaan
     * tehdä.
     *
     */
    void Dialog() {
        System.out.println("Paina 1 + ENTER, jos haluat pakata tiedoston");
        System.out.println("Paina 2 + ENTER, jos haluat purkaa tiedoston");
        System.out.println("Paina 3 + ENTER, jos haluat lopettaa");
        System.out.print("Anna valinta: ");
        number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            CompressHuffman();
        }
    }

    /**
     * Metodi käynnistää tiedoston pakkauksen Huffmanin algoritmilla.
     *
     */
    void CompressHuffman() {
        System.out.println("Anna pakattavan tiedoston osoite niin, että \\-merkin tilalla on /-merkki ");
        file = new File(scanner.nextLine());
        filereader = new FileReader(file);
        String text = filereader.Read();
        Huffman huffman = new Huffman(text);
        huffman.StartHuffman();
    }

}
