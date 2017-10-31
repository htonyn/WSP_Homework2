/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsp_homework2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.control.Label;


public class WSP_Homework2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.add(new Label("Number Information"), 0, 0);
        
        NumberInformationWidget niw = new NumberInformationWidget();
        root.add(niw, 0, 1);
        root.setHgrow(niw, Priority.ALWAYS);
        Scene scene = new Scene(root, 800, 800);
        GuessingGameWidget ggw = new GuessingGameWidget();
        root.add(new Label("Guessing Game"), 0, 2);
        root.add(ggw, 0, 3);
        
        primaryStage.setTitle("Homework 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
