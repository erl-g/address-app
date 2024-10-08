package dev.erl.app.About;


import dev.erl.core.controller.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class AboutController extends Controller{

   @FXML
   private ImageView imageView;
    @FXML
    private Label namLabel;
    @FXML
    private Label addrLabel;
    @FXML
    private Label email;
    @FXML
    private Label contactLabel;
    @FXML
    private Label descriptionLabel;



    @Override
    protected void load_fields() {
      
        
    }
    @Override
    protected void load_bindings() {
       imageView.setImage(new Image(getClass()
                    .getResource("/dev/erl/assets/img/mario.png")
                    .toExternalForm()));
    }
    @Override
    protected void load_listeners() {
    
        
    }

    


}
