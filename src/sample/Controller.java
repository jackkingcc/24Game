package sample;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class Controller {
    @FXML
    private TextArea outputText1;
    @FXML
    private TextArea outputText2;
    @FXML
    private RadioButton modeButton1;
    @FXML
    private RadioButton modeButton2;
    @FXML
    private RadioButton modeButton3;
    @FXML
    private RadioButton modeButton4;
    public void initialize(){
        ToggleGroup modeGroup = new ToggleGroup();
        modeButton1.setToggleGroup(modeGroup);
        modeButton1.setSelected(true);
        modeButton2.setToggleGroup(modeGroup);
        modeButton3.setToggleGroup(modeGroup);
        modeButton4.setToggleGroup(modeGroup);
    }

    @FXML
    private void printOut(){
        outputText1.setText("HaHa");
        outputText2.setText("HeHe");

    }

}
