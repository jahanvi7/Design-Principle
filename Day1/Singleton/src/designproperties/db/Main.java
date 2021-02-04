package designproperties.db;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConn obj = DBConn.getInstance();
		if(obj != null) {
			System.out.println("Instance created");
		}
	}

}
