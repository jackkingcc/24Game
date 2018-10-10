package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.util.Duration;

import java.util.List;

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
        outputText1.setWrapText(true);
        outputText1.setStyle("-fx-font-size: 20");
        outputText2.setStyle("-fx-font-size: 15");
    }

    @FXML
    private void printOut(){
        int n=4,m=10;
        Calculator calculator = new Calculator();
        List<Integer> inputs=calculator.createRandom(n,m);
        outputText1.setText(inputs.toString());
        List<String> res= calculator.calculate(inputs);
        while(res.size()==0){
            res=calculator.calculate(inputs);
        }
        final  String text1 ="There are "+res.size()+" ways";
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5)));
        Timeline timeline2 = new Timeline(new KeyFrame(Duration.seconds(10)));
        StringBuilder display = new StringBuilder();
        for(String str:res){
            display.append(str+"\n");
        }
        timeline2.setOnFinished(event -> outputText2.setText(display.toString()));
        timeline.setOnFinished(event ->{outputText2.setText(text1);timeline2.play();
        });
        timeline.play();


    }

}
