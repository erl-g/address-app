package dev.erl.app;

import java.io.IOException;

import dev.erl.App;
import dev.erl.core.loader.Loader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class RootLoader extends Loader {

    public RootLoader(App app) {
        super("ROOT", app);
    }

    @Override
    public void load() {
        try {
            BorderPane root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/dev/erl/assets/theme/SKIN.CSS")
                    .toExternalForm());

            RootController controller = loader.getController();
            controller.load(app);

            app.getApplicationStage().getIcons().add(
                    new Image(getClass()
                            .getResource("/dev/erl/assets/img/mario.png")
                            .toExternalForm()));
            app.getApplicationStage().setMinWidth(1024);
            app.getApplicationStage().setMinHeight(728);
            app.getApplicationStage().setScene(scene);
            app.getApplicationStage().show();

            app.setApplicationRoot(root);
            root.setOnMouseClicked(e -> app.getApplicationRoot().requestFocus());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
