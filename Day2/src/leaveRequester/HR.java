package leaveRequester;

public class HR implements ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if(leaveRequest.getLeaveDays()>5 ) {
			System.out.println(leaveRequest.getEmployee() +" (HR) leave accepted for " +leaveRequest.getLeaveDays());
		}else {
			System.out.println(leaveRequest.getEmployee() + " (HR) leave rejected for " +leaveRequest.getLeaveDays());
		}
	}

}
