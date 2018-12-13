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
    	Map.Menu2.close();
    	Map.Menu3.show();
  	
    }
	
    void Exit (ActionEvent event) {
    	System.exit(0);
    }

}
