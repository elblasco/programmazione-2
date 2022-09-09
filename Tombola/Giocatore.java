import java.util.LinkedList;

public class Giocatore {
    String nome;
    LinkedList<Cartella> cartelle=new LinkedList();
    int nCartelle=0;

    public Giocatore(String nome){
        this.nome=nome;
        cartelle.add(new Cartella());
        nCartelle++;
    }

    public void aggiungi() {
        cartelle.add(new Cartella());
        nCartelle++;
    }

    public void controllaNumeri(int n){
        for(Cartella i:cartelle){
            if(!(i.copriNumero(n))){
                System.out.println(nome + " ha fatto tombola");
                System.exit(1);
            }
        }
    }

    @Override
    public String toString(){
        String s=nome+" ha:";
        for(int i=0;i<nCartelle;++i){
            s+=cartelle.get(i);
        }
        return s;
    }

    public static void main(String[] args) {
        Giocatore g1=new Giocatore("Aldo");
        g1.aggiungi();
        g1.aggiungi();
        System.out.println(g1);
        for(int i=1;i<=Common.MAXNUM;++i){
            g1.controllaNumeri(i);
            System.out.println("Viene estratto il "+i);
        }
    }
}
