package com.github.tylergaravaglia.hlamonitor.controllers;

import java.io.IOException;

import com.github.tylergaravaglia.hlamonitor.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
