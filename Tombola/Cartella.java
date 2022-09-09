import java.util.HashSet;
import java.util.Iterator;

public class Cartella {
    HashSet<Integer> numeri=new HashSet();

    Cartella(){
        for(int i=0;i<Common.NCELLS;++i){
            int daInserire=Common.generatore.nextInt(Common.MAXNUM)+1;
            if(numeri.contains(daInserire)){
                --i;
            }
            else{
                numeri.add(daInserire);
            }
        }
    }

    @Override
    public String toString(){
        String s="[";
        Iterator<Integer> iter=numeri.iterator();
        while(iter.hasNext()){
            s+=iter.next()+" ";
        }
        s+="]";
        return s;
    }
    public boolean copriNumero(int i){
        if(numeri.isEmpty()){
            return false;
        }
        else if(numeri.contains(i)){
            numeri.remove(i);
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        Cartella c1=new Cartella();
        System.out.println(c1);
        while(!c1.numeri.isEmpty()){
            int elem=Common.generatore.nextInt(Common.MAXNUM)+1;
            c1.copriNumero(elem);
            System.out.println(c1);
        }
    }
}
