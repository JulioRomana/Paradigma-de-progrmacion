package phowordto.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WelcomeController {

    @FXML
    private AnchorPane background;

    @FXML
    private Button buttonstart;

    @FXML
    private ImageView cat;

    @FXML
    private Text namegame;

    @FXML
    void showCongratulations(ActionEvent event) throws IOException {
        
            Parent root = FXMLLoader.load(getClass().getResource("/phowordto/view/Level1.fxml"));
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            
            Stage myStage = (Stage) this.buttonstart.getScene().getWindow();
            myStage.close();
            
            
     
    }

}
