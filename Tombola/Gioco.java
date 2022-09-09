public class Gioco {
    public static void main(String[] args) {
        Cartellone banco=new Cartellone();
        Giocatore g1=new Giocatore("Aldo");
        Giocatore g2=new Giocatore("Giovanni");
        Giocatore g3=new Giocatore("Giacomo");
        g1.aggiungi();
        g1.aggiungi();
        g2.aggiungi();
        g3.aggiungi();
        g3.aggiungi();
        g3.aggiungi();
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        for(int i=0;i<Common.MAXNUM;++i){
            int estratto = banco.estrai();
            g1.controllaNumeri(estratto);
            g2.controllaNumeri(estratto);
            g3.controllaNumeri(estratto);
        }
    }
}
