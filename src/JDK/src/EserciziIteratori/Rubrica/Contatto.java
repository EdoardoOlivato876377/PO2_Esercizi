package EserciziIteratori.Rubrica;
/*
Esercizio 1. Sia data una classe Contatto le cui istanze rappresentano contatti telefonici. Ogni contatto ha
un nome, un cognome e un numero telefonico (tutti di tipo String), un costruttore che riceve come parametro
il nome, il cognome e il numero di telefono associati al contatto, metodi per leggere tali valori e il metodo
toString() che restituisce una rappresentazione testuale del contatto.
Scrivere una classe Rubrica che rappresenta una collezione di contatti. La classe memorizza i contatti per
mezzo di una lista ed è dotata dei seguenti metodi:
 void aggiungiContatto(String nome, String cognome, String telefono) che aggiunge un contatto alla
rubrica;
 void rimuoviContatto(String nome, String cognome) che rimuove dalla rubrica il contatto associato
al nome e cognome dati;
 String cerca(String nome, String cognome) che dato un nome e cognome restituisce il numero di
telefono associato a quel nome e cognome oppure null se il nome e cognome non sono presenti in
rubrica;
 String toString() che restituisce una descrizione testuale dell’intera rubrica.
 */
public class Contatto {
    String nome;
    String cognome;
    String numeroDiTelefono;

    public Contatto(String n, String c, String num){
        this.nome=n;
        this.cognome=c;
        this.numeroDiTelefono=num;
    }

    public String nometoString(){
        return nome;
    }
    public String cognometoString(){
        return cognome;
    }
    public String telefonotoString(){
        return numeroDiTelefono;
    }
}
