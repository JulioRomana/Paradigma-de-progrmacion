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

public class CongratulationsController {

    @FXML
    private AnchorPane background;

    @FXML
    private Button buttonnext;

    @FXML
    private ImageView cat2;

    @FXML
    private Text congratulations;
    
     @FXML
    private void btn(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/phowordto/view/Welcome.fxml"));
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            
            Stage myStage = (Stage) this.buttonnext.getScene().getWindow();
            myStage.close();
    }

}
