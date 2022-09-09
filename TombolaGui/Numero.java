package sample;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Numero extends StackPane {
    int valore;
    boolean estratto;

    Numero(int valore){
        this.valore=valore;
        estratto=false;
        Text testo=new Text(valore+"");
        Rectangle rettangolo=new Rectangle();
        rettangolo.setFill(Color.GREENYELLOW);
        testo.setFont(new Font(32));
        rettangolo.setStroke(Color.BLACK);
        rettangolo.setHeight(testo.getFont().getSize()+2);
        rettangolo.setWidth(testo.getFont().getSize()+2);
        this.getChildren().addAll(rettangolo, testo);
    }

    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        else if(o.getClass()==this.getClass()){
            return ((Numero)o).valore==this.valore;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return valore;
    }

    @Override
    public String toString(){
        return ""+valore;
    }
}
