package Interface;

import java.util.ArrayList;
import java.util.List;

public class User {

	static String name;
	static String password;
	
	@SuppressWarnings("static-access")
	public User(String name, String password) {
		
		this.name = name;
		this.password = password; 
		
	}
	
	static List<User> user_list = new ArrayList<User>();
	
	public static void mainlist() {
		
	user_list.add(new User("Borja", "password"));
	user_list.add(new User("Perico", "qwerty"));
		

	}
	
	@SuppressWarnings("static-access")
	public static void sign_in_control() {
		
		User.mainlist();
		
		for(int i = 0; i <= user_list.size()-1; i++) {
			
			if(SingController.User_Input.equals(user_list.get(i).name) && (SingController.Password_Input.equals(user_list.get(i).password) )) {
				
				SingController.confirm = true;
				
			}				
		}		
	}

}