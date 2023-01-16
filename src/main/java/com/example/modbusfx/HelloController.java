package com.example.modbusfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class HelloController {


    @FXML
    private ComboBox<String> Com_ComboBox;

    @FXML
    private ComboBox<String> Connection_Speed_ComboBox;

    @FXML
    private Label Status_Label;

    @FXML
    private Button Update_Button;

    @FXML
    private Button Open_COM_Port_Button;

    private boolean indicator = false;

    @FXML
    protected void openComPort() {

        if(!indicator) {
            Status_Label.setText("COM порт открыт");
            Status_Label.setTextFill(Color.web("#03b553"));
            indicator = true;
        }else{
            Status_Label.setText("COM порт закрыт");
            Status_Label.setTextFill(Color.web("#f80505"));
            indicator = false;
        }

    }

    @FXML
    protected void updateComPorts(){

    }

    @FXML
    void initialize(){
        //установка скоростей
        ObservableList<String> connection_speed_list = FXCollections.observableArrayList("57600", "115200", "230400", "460800", "921600","1000000","2000000");
        Connection_Speed_ComboBox.setItems(connection_speed_list);
        Connection_Speed_ComboBox.setValue(connection_speed_list.get(4));
        //кнопка update com port's
        Update_Button.graphicProperty().setValue(new ImageView(new Image(getClass().getResourceAsStream("up.png"))));

    }

}