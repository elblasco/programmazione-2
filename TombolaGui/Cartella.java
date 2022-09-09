package sample;

import javafx.scene.Node;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.HashSet;

public class Cartella extends GridPane {
    HashSet<Numero> numeri=new HashSet();

    private Node getNodeGP(GridPane gp,int colonne,int righe){
        for(Node nodo:gp.getChildren()){
            if(gp.getColumnIndex(nodo)==colonne && gp.getRowIndex(nodo)==righe){
                return nodo;
            }
        }
        return null;
    }

    Cartella(){
        for(int i = 0; i< Common.NCELLS; ++i){
            Numero daInserire= new Numero(Common.generatore.nextInt(Common.MAXNUM)+1);
            if(numeri.contains(daInserire)){
                --i;
            }
            else{
                int riga=i/Common.NPERRIGA,colonna=daInserire.valore/10;
                numeri.add(daInserire);
                if(getNodeGP(this,colonna,riga)!=null){
                    this.add(daInserire,colonna+1, riga);
                }
                else{
                    this.add(daInserire,colonna, riga);
                }
            }
        }
        this.setGridLinesVisible(true);
    }

    @Override
    public String toString(){
        String s=numeri.toString();
        return s;
    }

    public boolean copriNumero(Numero i){
        if(numeri.contains(i)){
            i.estratto=true;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Cartella c1=new Cartella();
        System.out.println(c1);
        System.out.println(c1.copriNumero(new Numero(8)));
    }
}
