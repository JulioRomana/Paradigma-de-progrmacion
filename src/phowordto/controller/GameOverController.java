package phowordto.controller;

import java.io.IOException;
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

public class GameOverController {

    @FXML
    private Text GAMEOVER;

    @FXML
    private AnchorPane background;

    @FXML
    private Button buttonback;

    @FXML
    private Button buttontryagain;

    @FXML
    private ImageView cat3;
     @FXML
    private void back(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/phowordto/view/Welcome.fxml"));
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            
            Stage myStage = (Stage) this.buttonback.getScene().getWindow();
            myStage.close();
    }
     @FXML
    private void tryagain(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/phowordto/view/Level1.fxml"));
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            
            Stage myStage = (Stage) this.buttontryagain.getScene().getWindow();
            myStage.close();
    }

}


