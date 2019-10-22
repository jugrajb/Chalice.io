package ui;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    private double xoffset = 0;
    private double yoffset = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("application.fxml"));
        Scene scene = new Scene(root);
        scene.setFill(Color.TRANSPARENT);

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        ///stage.getIcons().add(new Image("images/app_icon.png"));
        stage.show();

        root.setOnMousePressed(event -> {
            xoffset = event.getSceneX();
            yoffset = event.getSceneY();
        });

        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() - xoffset);
            stage.setY(event.getScreenY() - yoffset);
        });

    }
}
