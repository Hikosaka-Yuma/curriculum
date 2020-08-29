package check;

import constants.Constants;

public class Check {

	//問1
	private static String firstName = "hikosaka";
	private static String lastName = "yuma";


	//public String printName(String firstName, String lastName) {

	//}






	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・
		printName(firstName,lastName);
		printPet();
		printRobotPet();









	}

	//問2
	private static void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド => " + firstName + lastName);
	}

	//問3

	private static void printPet() {
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
	}

	private static void printRobotPet() {
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}



}
