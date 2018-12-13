package Interface;

//import java.awt.TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Books {

    @FXML
    private TextArea list;   

    @FXML
    private Button Back;

    @FXML
    private Button Horror;
    
    @FXML
    private Button Adventure;
    
    @FXML
    private Button Action;
    
    
    @FXML
    void Back(ActionEvent event) {
    	Map.Menu4.close();
    	Map.Menu2.show();
		list.clear();

    }
    
    @FXML
    void Adventure(ActionEvent event) {

    	list.setText(BookList.adv());
    	
    }

  
	
    @FXML
    void Horror(ActionEvent event) {
    	
    	list.setText(BookList.hor());
    	
    	
    }
    
	@FXML
	    void Action(ActionEvent event) {
		
		list.setText(BookList.act());
		  
	    }

    
}
