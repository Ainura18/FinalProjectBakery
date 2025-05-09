package com.pastrygame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Бастапқы экран
        Text welcomeText = new Text("Сіз ойынды бастауға дайынсыз ба?");
        Button startButton = new Button("Старт");

        StackPane startRoot = new StackPane();
        startRoot.getChildren().addAll(welcomeText, startButton);
        StackPane.setAlignment(welcomeText, javafx.geometry.Pos.TOP_CENTER);
        StackPane.setAlignment(startButton, javafx.geometry.Pos.CENTER);

        Scene startScene = new Scene(startRoot, 800, 600);
        primaryStage.setTitle("Pastry Game Project");
        primaryStage.setScene(startScene);
        primaryStage.show();

        startButton.setOnAction(e -> showSelectionScreen(primaryStage));
    }

    private void showSelectionScreen(Stage stage) {
        Text question = new Text("Сіз не дайындағыңыз келеді?");
        HBox imageButtonsBox = new HBox(20);
        imageButtonsBox.setStyle("-fx-alignment: center; -fx-padding: 20;");

        // Сурет жолдары
        String[] imagePaths = {
                "/images/cake.png",
                "/images/croissant.png",
                "/images/cookie.png",
                "/images/donut.png",
                "/images/muffin.png"
        };

        // Әр суретке арналған батырма жасау
        for (String path : imagePaths) {
            Button imageButton = createImageButton(path);
            imageButtonsBox.getChildren().add(imageButton);
        }

        StackPane selectionRoot = new StackPane();
        selectionRoot.getChildren().addAll(question, imageButtonsBox);
        StackPane.setAlignment(question, javafx.geometry.Pos.TOP_CENTER);
        StackPane.setAlignment(imageButtonsBox, javafx.geometry.Pos.CENTER);

        Scene selectionScene = new Scene(selectionRoot, 800, 600);
        stage.setScene(selectionScene);
    }

    private Button createImageButton(String imagePath) {
        Image image = new Image(getClass().getResourceAsStream(imagePath));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(120);
        imageView.setFitHeight(120);

        Button button = new Button();
        button.setGraphic(imageView);
        return button;
    }

    public static void main(String[] args) {
        launch();
    }
}
