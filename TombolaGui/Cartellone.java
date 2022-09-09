package sample;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.util.LinkedList;

public class Cartellone extends GridPane {
    LinkedList<Numero> sacchetto=new LinkedList();

    Cartellone(){
        for(int i = 1; i<= Common.MAXNUM; ++i){
            int colonne=i/3,righe=i%3;
            Numero tmp=new Numero(i);
            sacchetto.add(tmp);
            this.add((new Text(tmp.valore+"")),colonne,righe);
        }

    }

    public Numero estrai(){
        if(sacchetto.size()==0){
            System.out.println("Sacchetto vuoto");
            System.exit(1);
        }
        int indice= Common.generatore.nextInt(sacchetto.size());
        Numero nEstratto=sacchetto.get(indice);
        sacchetto.remove(indice);
        System.out.println("Il banco ha estratto il "+nEstratto);
        return nEstratto;
    }

    public static void main(String[] args) {
        Cartellone b1=new Cartellone();
        for(int i=0;i<=Common.MAXNUM;++i){
            b1.estrai();
        }

    }
}
