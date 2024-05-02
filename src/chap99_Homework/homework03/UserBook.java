package chap99_Homework.homework03;

public class UserBook {
	public User[] users = new User[100];
	public int index = 0;
	
	public UserBook() {
		
	}
	
	public void saveUserInfo(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setId(this.index+1);
		
		users[index++] = user;
	}
	
	public void printUserInfo(int index) {
		if(users[index]!=null) {
			System.out.println("id: "+users[index].getId());
			System.out.println("username: "+users[index].getUsername());
			System.out.println("password: "+users[index].getPassword());
		} else {
			System.out.println("해당 인덱스에 저장된 데이터가 없습니다.");
		}
		
	}
}
