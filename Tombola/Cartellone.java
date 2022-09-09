import java.util.LinkedList;
import java.util.List;

public class Cartellone {
    List<Integer> sacchetto;

    Cartellone(){
        sacchetto=new LinkedList();
        for(int i=1;i<=Common.MAXNUM;++i){
            sacchetto.add(i);
        }
    }

    public int estrai(){
        if(sacchetto.size()==0){
            System.out.println("Sacchetto vuoto");
            System.exit(1);
        }
        int indice=Common.generatore.nextInt(sacchetto.size());
        int nEstratto=sacchetto.get(indice);
        sacchetto.remove(indice);
        System.out.println("Il banco ha estratto il "+nEstratto);
        return nEstratto;
    }

    public static void main(String[] args) {
        Cartellone c1=new Cartellone();
        for(int i=0;i<Common.MAXNUM;++i){
            c1.estrai();
        }
    }
}
