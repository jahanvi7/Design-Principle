package publishMessage;

public class MessageSubscriberThree implements Observer
{
	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent());
	}

	@Override
	public void updateState(State state) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberThree :: " + state.getState());
	}
}