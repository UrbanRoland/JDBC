package connection;

import java.util.ArrayList;

public class Connection {

	public static void main(String[] args) {
		DB db=new DB();
		
		//db.addUser("Pista", "test");
		//db.showAllUsers();
		//db.showUsersMeta();
		ArrayList<User> users=db.getAllUsers();
		for(User u : users) {
			System.out.println(u.getName()+" "+u.getAddress());
		}
	}
	
}
