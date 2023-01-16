module com.example.modbusfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.modbusfx to javafx.fxml;
    exports com.example.modbusfx;
}