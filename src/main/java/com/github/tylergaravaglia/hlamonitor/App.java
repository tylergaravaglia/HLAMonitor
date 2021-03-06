package com.github.tylergaravaglia.hlamonitor;

import com.github.tylergaravaglia.hlamonitor.parsers.RprFomParser;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("controllers/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {

        RprFomParser parser = new RprFomParser();
        parser.parseFile(System.getProperty("user.dir") + File.separator + "RPR_FOM_v2.0_1.3.omt");

        //launch();
    }

}