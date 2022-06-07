package SimulazioneEsame_1.Poker;

public class TestPlay {
    public static void main(String [] argv){
        Play prova=new Play();
        prova.mescolaMazzo();
        int full=555;
        prova.prellevaMano(prova.MazzoReal);
        int computer=prova.Trovato(prova.MazzoReal);
        int Player1=prova.Trovato(prova.MazzoReal);
        if(Player1!=full) {//Player
            Player1=prova.Trovato(prova.MazzoReal);
        }
        if(computer>Player1) {
            System.out.println("Il vincitore è: Computer");
        }else if(computer<Player1) {
            System.out.println("Il vincitore è: Player1");
        }else {
            System.out.println("Stallo/Pareggio");
        }
    }
}
