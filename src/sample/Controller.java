package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text animalName;
    @FXML
    private Button buttonDog;
    @FXML
    private Button buttonFish;
    @FXML
    private Button buttonCat;


    public void ClickTheDog( ActionEvent actionEvent) {
        animalName.setText("Give me a bone.");
    }
    public void ClickTheFish (ActionEvent actionEvent) {
        animalName.setText("No hooks for me.");

    }
    public void ClickTheCat(ActionEvent actionevent){
        animalName.setText("Send more mice,Tweetie.");
    }
}
