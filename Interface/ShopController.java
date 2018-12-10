package Interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ShopController {

    @FXML
    private Button Show;
    
    @FXML
    private Button Exit;
    
	@FXML
    void Show(ActionEvent event) {
    	Singin.Menu2.close();
    	Singin.Menu3.show();
  	
    }
	
    void Exit (ActionEvent event) {
    	System.exit(0);
    }

}