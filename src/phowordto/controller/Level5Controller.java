package phowordto.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Level5Controller {

    @FXML
    private Label ask;

    @FXML
    private AnchorPane background;

    @FXML
    private ImageView book;

    @FXML
    private ImageView burbuja;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private ImageView cat;
    
     @FXML
    private void btnTrue(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/phowordto/view/Congratulations.fxml"));
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            
            Stage myStage = (Stage) this.button2.getScene().getWindow();
            myStage.close();
    }
    @FXML
    private void btnfalse1(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/phowordto/view/GameOver.fxml"));
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            
            Stage myStage = (Stage) this.button1.getScene().getWindow();
            myStage.close();
    }
     @FXML
    private void btnfalse2(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/phowordto/view/GameOver.fxml"));
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            
            Stage myStage = (Stage) this.button3.getScene().getWindow();
            myStage.close();
    }
     @FXML
    private void btnfalse3(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/phowordto/view/GameOver.fxml"));
            
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            
            Stage myStage = (Stage) this.button4.getScene().getWindow();
            myStage.close();
    }

}
