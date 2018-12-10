package Interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SingController {
	
	static String User_Input;
	static String Password_Input;
	public static boolean confirm = false;
	

    @FXML
    private TextField user;

    @FXML
    private PasswordField pass;

    @FXML
    private Button SingIn;

    @FXML
    void SingIn(ActionEvent event) {
    	
    	User_Input = user.getText();
    	Password_Input = pass.getText();
    	
    	User.sign_in_control();
    	
    	if(SingController.confirm) {
    	
    	Singin.Menu.close();
    	Singin.Menu2.show();
    	
    	}
    	
    }

    @FXML
    void User(ActionEvent event) {

    }

    @FXML
    void Password(ActionEvent event) {

    }

}
