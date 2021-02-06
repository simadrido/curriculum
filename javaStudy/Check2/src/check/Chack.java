package check;

import constans.Constants;

;

public class Chack {
	
	
	public static void main(String[] args) {
		 String firstName = "嶋田";
		 String lastName  = "リド";
    System.out.println("printNameメソッド → "+printName(firstName,lastName));
    
    
    
    Pet pet = new Pet(Constants.CHECK_CLASS_HOGE,Constants.CHECK_CLASS_JAVA);
    pet.introduce();
    Pet rpet = new RobotPet(Constants.CHECK_CLASS_LUKE, Constants.CHECK_CLASS_R2D2);
    rpet.introduce();
	
	}
	private static String printName(String firstName, String lastName){
		return firstName + lastName;

    
	
	
	
	   
	   
	}
	
}
