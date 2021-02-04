package designproperties.solidprinciples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to our site. Would you like to order or repair?");
		Scanner sc = new Scanner(System.in);
		String processOption = sc.nextLine().toLowerCase().trim();
		PhoneOrder phoneOrder = new PhoneOrder();
		PhoneRepair phoneRepair = new PhoneRepair();
		String productDetail = "";
		
		switch(processOption) 
		{
		case  "order":
			System.out.println("Please provide the phone model number");
			productDetail = sc.nextLine().trim();
			phoneOrder.ProcessOrder(productDetail);
			break;
			
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine().trim();
			if(productType.equals("phone")) {
				System.out.println("Please provide the phone model number");
				productDetail = sc.nextLine().trim();
				phoneRepair.ProcessPhoneRepair(productDetail);
			}
			else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine().trim();
				phoneRepair.ProcessAccessoryRepair(productDetail);
			}
		}
		sc.close();
	}
}
