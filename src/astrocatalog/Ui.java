package astrocatalog;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class Ui {

    ObservableList sky = FXCollections.observableArrayList();
   
    @FXML
    private MenuItem Exit;

    @FXML
    public ListView<String> skyList;

    @FXML
    public ImageView objView;

    @FXML
    public TextArea detailTxt;

    @FXML
    private Label Status;

    @FXML
    void Quit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void about(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText(null);
        alert.setContentText("This app has been created by Gruppo 999.\n"
                + "- Alberto Perro\n- Daniele Pani\n- Leonardo Misuraca\n- Roberto Belcastro");
        alert.showAndWait();
    }
    
    public void loadSky(){
        skyList.getItems().addAll(sky);
    }
}
