package leaveRequester;

public class Supervisor implements ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if(leaveRequest.getLeaveDays()>1 && leaveRequest.getLeaveDays()<=3) {
			System.out.println(leaveRequest.getEmployee() + " (Supervisor) leave accepted for " +leaveRequest.getLeaveDays());
		}else {
			System.out.println(leaveRequest.getEmployee() + " (Supervisor) leave rejected for " +leaveRequest.getLeaveDays());
		}
	}

}
