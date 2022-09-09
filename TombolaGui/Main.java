package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application {
    @Override public void start(Stage primaryStage) throws Exception{
        Scene scena=new Scene(new Giocatore("Aldo",2),800,150);
        primaryStage.setScene(scena);
        primaryStage.show();
    }
    public static void main(String[] args) {launch(args);}}