package tls.sofoste.esifitapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class ESIFITApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ESIFITApp.class.getResource("landing-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 505);
        stage.setResizable(false);
        stage.setTitle("ESI-FITNESS CLIENT MANAGER [ - - - ] M A I N - P A G E");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}