package SimulazioneEsame_1.CarSharing;

/*

Simulate un sistema di car sharing usato da lavoratori pendolari per caricare e scaricare passeggeri in apposite stazioni.
Immaginate che ci siano 30 stazioni, a un miglio di distanza una dall’alta lungo un determinato percorso: per ogni
stazione generate un numero casuale di automobili, ciascuna con una destinazione determinata casualmente, e un numero
casuale di passeggeri, ciascuno con una destinazione ancora determinata casualmente. Ogni guidatore carica a bordo tre
passeggeri a caso, scelti tra quelli la cui destinazione precede quella del guidatore, scaricandoli nella stazione
giusta e caricando, se possibile, altri passeggeri. La tariffa che viene pagata al guidatore e’ un importo costante per
ciascun miglio di distanza percorso da ciascun passeggero. Eseguite la simulazione mille
volte e visualizzate l’incasso medio per miglio percorso. Progettate le classi Car (automobile), Passenger (passeggero),
Station (stazione) e Simulation (simulazione).

 */

public class Passeggeri {
    public int stazione_di_partenza;
    public int stazione_di_destinazione;

    Passeggeri(){};

}
