package publishMessage;

public class MessageSubscriberTwo implements Observer
{
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
	}

	@Override
	public void updateState(State state) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberTwo :: " + state.getState());
	}
}