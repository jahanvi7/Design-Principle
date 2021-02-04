package designproperties.dependency.inversal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsumgNote samsumgNote = new SamsumgNote();
		Redmi7 redmi7 = new Redmi7();
		ProcessPhoneRepair processPhoneRepair = new ProcessPhoneRepair();
		
		processPhoneRepair.repairSteps(samsumgNote);
		processPhoneRepair.repairSteps(redmi7);
	}

}
