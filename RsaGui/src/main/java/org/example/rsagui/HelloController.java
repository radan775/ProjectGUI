package org.example.rsagui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private Button anchorPane;

    @FXML
    void switchDecrypt(ActionEvent event) {
        new SceneControl(anchorPane, "view/DecryptWd.fxml");
    }

}
