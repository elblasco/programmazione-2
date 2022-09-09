package sample;

import javafx.scene.control.Button;

public class MyButton extends Button {
    MyButton(String s){
        super(s);
        this.setPrefWidth(100);
        this.setPrefHeight(100);
    }
}
