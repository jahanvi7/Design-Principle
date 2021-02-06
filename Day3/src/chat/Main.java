package chat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IUser user1 = new BasicUser("Jake");
		IUser user2 = new BasicUser("Amy");
		IUser user3 = new PremiumUser("Rosa");
		IUser user4 = new PremiumUser("Kevin");
		
		ChatMediator chatMediator = new ChatMediator();
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		
		user2.sendMessage("Cool");
		user3.receiveMessage("Hello Everyone");
	}

}
