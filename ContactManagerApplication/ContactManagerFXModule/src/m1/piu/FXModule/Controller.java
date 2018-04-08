package m1.piu.FXModule;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    AnchorPane anchorPane;

    @FXML
    Button newContactBtn;

    @FXML
    public void initialize() throws Exception {
        //Parent panel = FXMLLoader.load(getClass().getResource("FXMLMainPanel.fxml"));
        //this.anchorPane.getChildren().setAll(panel);
    }

   /* public void onClickContactBtn(MouseEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("FXMLNewContact.fxml"));
            Stage stage = new Stage();
            stage.setTitle("New contact");
            stage.setScene(new Scene(root, 350, 350));
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
