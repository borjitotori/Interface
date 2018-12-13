package Interface;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class Map extends Application {

		static Stage Menu;
		static Stage Menu2;
		static Stage Menu3;
		static Stage Menu4;
		
		static Stage libro1;
		static Stage libro2;
		static Stage libro3;

		@Override
		public void start(Stage stage) throws Exception {
			
			Menu = new Stage();
			Menu2 = new Stage();
			Menu3 = new Stage();
			
			try {
			
			URL res = getClass().getClassLoader().getResource("SingIn.FXML.fxml");
			Parent root = FXMLLoader.load(res);
			Scene scene = new Scene(root);
			Menu.setTitle("sing_in");
			Menu.setScene(scene);
			Menu.show();
			
			URL res2 = getClass().getClassLoader().getResource("Options.fxml");
			Parent root2 = FXMLLoader.load(res2);
			Scene scene2 = new Scene(root2);
			Menu2.setTitle("opciones");
			Menu2.setScene(scene2);
		
			URL res3 = getClass().getClassLoader().getResource("bookList.fxml");
			Parent root3 = FXMLLoader.load(res3);
			Scene scene3 = new Scene(root3);
			Menu4.setTitle("Lista_libros");
			Menu4.setScene(scene3);
		
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	public static void main() {
		launch(null);
	}
}
