package publishMessage;

public class MessageSubscriberOne implements Observer
{
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
	}

	@Override
	public void updateState(State state) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberOne :: " + state.getState());
	}
}
