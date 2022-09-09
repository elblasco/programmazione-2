package sample;

import javafx.scene.layout.HBox;
import java.util.LinkedList;

public class Giocatore extends HBox {
    String nome;
    LinkedList<Cartella> cartelle=new LinkedList();
    int nCartelle;

    public Giocatore(String nome,int nCartelle){
        this.nome=nome;
        if(nCartelle==0){
            System.out.println("Devi avere almeno una cartella");
            nCartelle=1;
        }
        else{
            this.nCartelle=nCartelle;

        }
        for(int i=0;i< nCartelle;++i){
            Cartella tmp=new Cartella();
            cartelle.add(tmp);
            this.getChildren().add(tmp);
        }
        this.setSpacing(30);
    }
}
