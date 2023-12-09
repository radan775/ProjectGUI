module com.example.calculatorgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.calculatorgui to javafx.fxml;
    exports com.example.calculatorgui;
}