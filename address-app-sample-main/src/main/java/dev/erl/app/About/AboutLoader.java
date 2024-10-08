package dev.erl.app.About;

import java.io.IOException;

import dev.erl.App;
import dev.erl.core.loader.Loader;
import javafx.scene.Scene;
import javafx.scene.image.Image;

import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AboutLoader  extends Loader{

    public AboutLoader(App app){
        super("about/About", app);
    }

    @Override
    public void load() {
        try {
            BorderPane root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/dev/erl/assets/theme/SKIN.css").toExternalForm());


            AboutController controller = loader.getController();
            controller.load(app);

            Stage aboutStage = new Stage();
            aboutStage.setTitle("Address App - About");
            aboutStage.getIcons()
                    .add(new Image(getClass()
                    .getResource("/dev/erl/assets/img/mario.png")
                    .toExternalForm()));
                    aboutStage.initOwner(app.getApplicationStage());
                    aboutStage.initModality(Modality.APPLICATION_MODAL);
                    aboutStage.setResizable(false);
                    aboutStage.setScene(scene);
                    aboutStage.showAndWait();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
