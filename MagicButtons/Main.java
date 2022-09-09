package sample;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Main extends Application {
    final int NBOTTONI=9;
    @Override public void start(Stage primaryStage){
        GridPane gp=new GridPane();
        MyButton[] buttons=new MyButton[NBOTTONI];
        for(int i=0;i<NBOTTONI;++i){
            buttons[i]=new MyButton(i+"");
        }
        int x=0;
        for(int i=0;i<NBOTTONI/3;++i){
            for(int j=0;j<NBOTTONI/3;++j,++x){
                gp.add(buttons[x],j,i);
            }
        }
        gp.addEventHandler(KeyEvent.KEY_TYPED,keyEvent -> {
            String input=keyEvent.getCharacter();
            if("012345678".contains(input)){
                int tasto=Integer.parseInt(input);
                buttons[tasto].setVisible(false);
            }
        });
        primaryStage.setTitle("Magic Buttons");
        primaryStage.setScene(new Scene(gp, 300, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {launch(args);}}