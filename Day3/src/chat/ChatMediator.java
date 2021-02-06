package chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users;
	
	@Override
	public void addUser(IUser user) {
		// TODO Auto-generated method stub
		users.add(user);
	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		for(IUser user : users) {
			user.receiveMessage(message);
		}
	}
	
	public ChatMediator() {
		users = new ArrayList<>();
	}

}
