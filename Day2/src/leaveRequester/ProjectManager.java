package leaveRequester;

public class ProjectManager implements ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if(leaveRequest.getLeaveDays()>3 && leaveRequest.getLeaveDays()<=5) {
			System.out.println(leaveRequest.getEmployee() + " (Project Manager) leave accepted for " +leaveRequest.getLeaveDays());
		}else {
			System.out.println(leaveRequest.getEmployee() + " (Project Manager) leave rejected for " +leaveRequest.getLeaveDays());
		}
	}

}
