package chap99_Homework.homework03;

public class UserBook {
	public User[] userBook = new User[100];
	public int index = 0;
	
	public UserBook() {
		
	}
	
	public void saveUserInfo(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setId(this.index+1);
	}
}
