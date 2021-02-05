package leaveRequester;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supervisor supervisor = new Supervisor();
		
		LeaveRequest leaveRequest1 = new LeaveRequest("Monica", 8);
		supervisor.handleRequest(leaveRequest1);
		
		LeaveRequest leaveRequest2 = new LeaveRequest("Pheobe", 3);
		supervisor.handleRequest(leaveRequest2);
		
		LeaveRequest leaveRequest3 = new LeaveRequest("Rachel", 4);
		supervisor.handleRequest(leaveRequest3);
		
	}

}
