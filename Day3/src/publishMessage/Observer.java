package publishMessage;

public interface Observer
{
	public void update(Message m);
	
	public void updateState(State state);
}