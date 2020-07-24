#Määrittelydokumentti

###Yleistä

Tarkoituksena on toteuttaa ohjelma, jolla voi pakata tekstitiedoston pienemmäksi. Ohjelmassa toteutetaan pakkaus ainakin Huffmanin algoritmia käyttäen ja mahdollisesti jotakin Lempel Zivin algoritmia tai sen muunnosta käyttäen, jos se on ajankäytöllisesti mahdollista.

###Käytetyt algoritmit ja tietorakenteet
Algoritmeista käytetään edellä mainittuja algoritmeja. <br/>

Tietorakenteista Huffmanin algoritmissa käytetään puurakennetta ja prioriteettijonoa.

###Syötteet
Ohjelma saa syötteenä txt-muotoisen tekstitiedoston. Tiedosto luetaan, jonka jälkeen se pakataan ja tallennetaan uuteen tiedostoon.

###Tavoitteena olevat aika- ja tilavaatimukset
Huffmanin algoritmin osalta tavoitteena on O(n log n) nopeudella toimiva sovellus. Aikavaatimus perustuu algoritmia käsittelevässä Wikipedia artikkelissa annettuun aikaan. Tavoitteena tilan osalta on, että ohjelma pystyisi pakkaamaan tiedoston niin, että se veisi korkeintaan 60 prosenttia alkuperäisen tiedoston tilasta.

###Lähteet
* https://fi.wikipedia.org/wiki/Huffmanin_koodaus
* https://en.wikipedia.org/wiki/Huffman_coding
* https://fi.wikipedia.org/wiki/Lempel-Ziv
* https://en.wikipedia.org/wiki/LZ77_and_LZ78

