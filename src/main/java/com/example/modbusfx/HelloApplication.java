package com.example.modbusfx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("face.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 220);
        //stage.getIcons().add(new Image("https://innoscope.ru/netcat_files/356_18.png"));
        stage.getIcons().add(new Image(getClass().getResourceAsStream("mini_aspect.png")));
        stage.setTitle("БДС-АБ2 Modbus подключение");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}