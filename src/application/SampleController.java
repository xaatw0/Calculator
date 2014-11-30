package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController {

	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;

	@FXML private TextField text;

    @FXML
    public void onbtnNumberClicked(ActionEvent event) {

    	Object obj = event.getSource();
    	Button btn = (Button)obj;

    	String str = text.getText();
    	text.setText(str + btn.getText());
    }
}
