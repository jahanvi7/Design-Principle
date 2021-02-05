package leaveRequester;

public interface ILeaveRequestHandler {

	public ILeaveRequestHandler nextHandler = null;
	
	public void handleRequest(LeaveRequest leaveRequest);
}
