# Java 

## Schleifen

### Aufgabe 5.3 - Caesar Chiffre 

Wir wissen ja, dass jedes Zeichen in Java einen eindeutigen Code hat. Genauergesagt ist die numerische Repräsentation eines Characters/Zeichens der [Unicode](https://unicode-table.com/de/#control-character). 

Die Caesar Chiffre ist ein simpler Verschlüsselungsalgorithmus bei dem alle Buchstaben um einen bestimmten offset X verschoben werden, erreichst du das Z solltest du wieder beim A starten, Sonderzeichen werden wir jetzt einmal auslassen.

Mit einer Caesar Chiffre von 6 würde aus dem Text:
```
Ein Charakter namens Caesar!
```
folgendes werden: 
```
Kot Ingxgqzkx tgskty Igkygx!
```
wenn wir diesen Text nochmal um 6 verschlüsseln würde aus dem Text:
```
Quz Otmdmwfqd zmyqze Omqemd!
```

Schreib ein Programm dass von der Konsole einen beliebiglangen Text einliest, danach zufällig einen Schlüssel zwischen 1 und 26 wählt und den verschlüsselten String ausgibt.

siehe Schrödinger s.84 

-------------------------------------------------------

# Java 

## Loops

### Exercise 5.3 - Caesar Chiffre 

We know that every letter in Java has a unique code. In detail the numerical representation of a character is the [Unicode](https://unicode-table.com/de/#control-character). 

The caesar chiffre is a simple encryption algorithm, that rotates every letter with an offset X. When you reach the Z you should start again with the A for the purpose of this exercise. Moreover we will ignore all special characters for now.

With a Caesar Chiffre of 6 the following text
```
Ein Charakter namens Caesar!
```
would be encrypted to:
```
Kot Ingxgqzkx tgskty Igkygx!
```
when an encrypted again with a key of 6 we get:
```
Quz Otmdmwfqd zmyqze Omqemd!
```

Write a program that reads any text from the console, generates a key between 1 and 26 and prints the encrypted message.

see Schrödinger s.84 
