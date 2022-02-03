package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * First launch(), then init(), then start() from Application class are run
 * init() and start() are empty, therefore we need to override them
 * When the user closes the window, the empty stop() method is run
 */

public class Main extends Application {

    /** start()
     *
     * @param primaryStage
     * @throws Exception
     *
     * Takes in 1 parameter: Stage, which is a top level container which extends Window class
     * On the first line the fxml-file is loaded, which tells us what controller is used
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        /** Window settings
         * We are setting the same variables like in the "sample.fxml" file
         * GridPane fx:controller="sample.Controller" xmlns:fx="http://javafx.com/fxml" alignment="center" hgap="10" vgap="10"
         */
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);                               // vertical gap
//        root.setHgap(10);
//
//        /** Add JavaFX greeting (Label control)
//         */
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.GREEN);              // Set Text color
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD,70));
//
//        root.getChildren().add(greeting);               // Adding label control to the GridPane

        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
